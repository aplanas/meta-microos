SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python311-Pillow-9.5.0-3.1.aarch64.rpm"
RPM_HASH = "d9ccadb4dc84d50b80cdd977ad42db373ebda1c1d80b27dc53a993c5c828a2f1e38c998b089914527ee0c75c19cde122f4479898b6be9f59bb16194547ea2f4b"

RPROVIDES:${PN} += "python3-PIL \
python3-Pillow \
python3-imaging \
python3.11dist-pillow \
python311-PIL \
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
