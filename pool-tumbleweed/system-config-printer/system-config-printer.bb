SUMMARY = "A printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-1.5.18-3.1.aarch64.rpm"
RPM_HASH = "5b8aed93fa97dce2e7339e815f0c58785279e43e1c2d490edd480dc8dee5d6f04f4fc0de39629c2bfab9e29dda3c1a639c5094a1d2328c5d3b99d8810ba6084e"

RPROVIDES:${PN} += "system-config-printer"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-cups \
python3-pycurl \
system-config-printer-common"

inherit rpm
