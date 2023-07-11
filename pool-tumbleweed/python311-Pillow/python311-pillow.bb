SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python311-Pillow-9.5.0-2.3.aarch64.rpm"
RPM_HASH = "3ce7456dd8dd2d034bf6b17650f0538079e0f8c47bde09d26fa0c44162ce4f60512dfa681e2a45e0d92df6ca135b2a07cf872243c4f7f26073f45eff381089ee"

RPROVIDES:${PN} += "python3-Pillow \
python3-imaging \
python3.11dist-pillow \
python311-Pillow \
python311-imaging \
python3dist-pillow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libimagequant.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libopenjp2.so.7 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libz.so.1 \
python-abi \
python311-olefile"

inherit rpm
