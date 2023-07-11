SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python39-libsass-0.22.0-2.1.aarch64.rpm"
RPM_HASH = "ae0eff2ec0175b77e751473f01b96baba035dc8956ce1d4e2daa1d471c29139a817ab5cee36d9f88a4e4e7c1f8a4b89b3411a2a8e64a79f963e9fadb1358eac2"

RPROVIDES:${PN} += "python3.9dist-libsass \
python39-libsass \
python3dist-libsass"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsass-3.6.5.so.1 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
