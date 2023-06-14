SUMMARY = "Simple text editor for X"
DESCRIPTION = "Xedit is a simple text editor for X."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "xedit-1.2.3-2.4.aarch64.rpm"
RPM_HASH = "b248bdfae33f9cf4e29beb6024ec22d5605d06a700bb9c325c105845f095a0707927f5116046d112dfb34b0eb6740cba03990f8adf4381abbbde39eb0c38560f"

RPROVIDES:${PN} += "xedit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
