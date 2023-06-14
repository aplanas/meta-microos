SUMMARY = "HTML to ASCII Converter"
DESCRIPTION = "A tool for converting from HTML to ASCII. It can reasonably handle \
tables."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "html2text-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "fc75bf9a9ecaf52ef8ecad919ae5a79dd0f54c9712add2768d6a4166208127e1745114ef909b97d88c69e7972d3e56846d8a46e684e35beeded2db3d5421f262"

RPROVIDES:${PN} += "html2text"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
update-alternatives"

inherit rpm
