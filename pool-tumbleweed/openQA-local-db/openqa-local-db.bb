SUMMARY = "Helper package to ease setup of postgresql DB"
DESCRIPTION = "You only need this package if you have a local postgresql server \
next to the webui."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-local-db-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "862416273a5c932797d9e3e33700063f870321b693deb1933cf4ea6694e0c61ef4d0c7f6d76048d4204a2dabb9b0063c0e657eb2a08bba0d5ede5da3bf987c37"

RPROVIDES:${PN} += "openQA-local-db \
openQA-local-db(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
openQA \
postgresql-server"

inherit rpm
