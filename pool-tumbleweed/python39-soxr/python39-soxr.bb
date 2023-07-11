SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.5"

RPM_NAME = "python39-soxr-0.3.5-1.3.aarch64.rpm"
RPM_HASH = "edd1c22eeed04b7b931d2a2cda32746571e44b5652f9f32c35c407152f2fba9b4fe2427718c454301efe1b198bb01b2af85ea24dfca1fc8d5337654b3eacb894"

RPROVIDES:${PN} += "python3.9dist-soxr \
python39-soxr \
python3dist-soxr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsoxr.so.0 \
python-abi \
python39-numpy"

inherit rpm
