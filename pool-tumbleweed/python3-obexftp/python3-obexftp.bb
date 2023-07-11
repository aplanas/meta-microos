SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Python3 bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the python3 bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "python3-obexftp-0.24.2-1.24.aarch64.rpm"
RPM_HASH = "265058744ba31575798237dc8dfd845b0dec67852f6062f88ddc1cc8326a226000db26f9abd3b3df45133890dfa01de39bd736ab4e9c33ee52a452027b470610"

RPROVIDES:${PN} += "python3-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
python-abi"

inherit rpm
