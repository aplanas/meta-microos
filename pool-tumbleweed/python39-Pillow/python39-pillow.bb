SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-9.5.0-3.1.aarch64.rpm"
RPM_HASH = "5ee807870cd7184fbe0c2bb61efa2a9708ebc6299fcfcaf474afebe01052f0cdddc1a9f47a92038b177fbd6634bc070dc45fcc72ce4d700d14fc04f44314172a"

RPROVIDES:${PN} += "python3.9dist-pillow \
python39-PIL \
python39-Pillow \
python39-imaging \
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
python39-olefile"

inherit rpm
