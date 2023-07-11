SUMMARY = "A printer administration tool"
DESCRIPTION = "system-config-printer is a graphical user interface that allows the \
user to configure a CUPS print server."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "system-config-printer-1.5.18-2.2.aarch64.rpm"
RPM_HASH = "46d6c306a488b12c9a3c89bed8d5c3202432c2465e717914abc249789cd9fd314c6adec6f47845515577d09b25ff1a75253aa8aad88f563f08367935b393730d"

RPROVIDES:${PN} += "system-config-printer"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-cups \
python3-pycurl \
system-config-printer-common"

inherit rpm
