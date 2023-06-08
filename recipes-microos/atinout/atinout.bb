SUMMARY = "Utility to communicate with modems via AT commands"
DESCRIPTION = "This program will read a file (or stdin) containing a list of AT \
commands. Each command will be send to the modem, and all the response \
for the command will be output to file (or stdout). \
 \
Example, to hang up an ongoing call: \
 \
$ echo ATH | atinout - /dev/ttyACM0 - \
ATH \
OK \
$"
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "atinout-0.9.1-1.16.aarch64.rpm"
RPM_HASH = "31a0e15fbc071688e456eae905a05638495733564858d430c0fd447792014d60f49acbe0a2078db1bafd02266752fefd545629975b25594367727bf50d7d75b3"

RPROVIDES:${PN} += "atinout atinout(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
