SUMMARY = "A printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-1.5.18-2.1.aarch64.rpm"
RPM_HASH = "aba411e0ffe6752b193f680bb43f2dfd359526c93b78c2ccb76cc3d19e7f14d0fbb10d3264327d796e9caeec7e51add7a4cd4c86ec1a4f8bd50654eb5c8d8f94"

RPROVIDES:${PN} += "system-config-printer"

RDEPENDS:${PN} += "/bin/sh \
python3-cups \
python3-pycurl \
system-config-printer-common"

inherit rpm
