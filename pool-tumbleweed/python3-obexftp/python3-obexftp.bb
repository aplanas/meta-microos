SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Python3 bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the python3 bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "python3-obexftp-0.24.2-1.25.aarch64.rpm"
RPM_HASH = "389c313ba8263ad05ba6c03fd3f83c9bd182a872a7f78952c487f55e8d09d86b5b03b3a372e4e98681bd5efa01bde13beb2fe90888715b13b505196946346c5f"

RPROVIDES:${PN} += "python3-obexftp"

RDEPENDS:${PN} += "libc.so.6 \
libobexftp.so.0 \
obexftp \
python-abi"

inherit rpm
