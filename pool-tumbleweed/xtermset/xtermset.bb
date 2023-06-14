SUMMARY = "A program to change the settings of an xterm"
DESCRIPTION = "Xtermset allows you to change the characteristics of an xterm window \
from the command line. Most options have the same names as those that \
you would give an xterm at startup."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.5.2"

RPM_NAME = "xtermset-0.5.2-283.16.aarch64.rpm"
RPM_HASH = "9367162ecee3924745ad87abb96183629f7aec31e4ddf291d9ad6b771208844f1194fb868e9770eed112e942f434173fa78e3217800b338c14d48bd27a9445f2"

RPROVIDES:${PN} += "xtermset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
