SUMMARY = "Session Tools for the GNOME Desktop"
DESCRIPTION = "This package provides the basic session tools, like session management \
functionality, for the GNOME Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-44.0-2.1.aarch64.rpm"
RPM_HASH = "3b36edd9b3a9fe2c2f2c1e8baf7eda61701617e89c48308e93f4ed1ead4ca5b230fde1bc0d206ac3ca6263b84e30c9e6f9672ebc2547879e16bad10287690ceb"

RPROVIDES:${PN} += "gnome-session"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnome-session-core \
gnome-session-default-session"

inherit rpm
