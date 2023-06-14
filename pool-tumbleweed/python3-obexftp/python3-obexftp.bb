SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Python3 bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the python3 bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "python3-obexftp-0.24.2-1.22.aarch64.rpm"
RPM_HASH = "85987cda77abbaad30857bcb9c58be23bbff9435992f1ac45d9023cba9f501acc3774dcc6c1a4f40471724928ea0804ef3acea805af1574e970d5f7b55230dc0"

RPROVIDES:${PN} += "python3-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
python-abi"

inherit rpm
