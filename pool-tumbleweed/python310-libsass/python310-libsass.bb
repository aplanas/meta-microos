SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python310-libsass-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "8240d7e240fd625b971fbb68d3bd54f3b6fab90e608410e6223c868d8b59de94084dd36137b475c6c7ad3dcfab1f4d0dcadeb1aa5879e3e440fcf3c2f04db12e"

RPROVIDES:${PN} += "python3-libsass \
python3.10dist-libsass \
python310-libsass \
python3dist-libsass"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsass-3.6.5.so.1 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
