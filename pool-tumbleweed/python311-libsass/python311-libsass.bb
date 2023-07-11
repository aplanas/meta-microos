SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python311-libsass-0.22.0-2.1.aarch64.rpm"
RPM_HASH = "f7915638dd9b214ccf19b89914063f7170212b15e4fb28ce29fe823e93827318b07786169eebf7802dcb1f5bff7f47622211c54519c6ed9e7087ffdeee108cc2"

RPROVIDES:${PN} += "python3-libsass \
python3.11dist-libsass \
python311-libsass \
python3dist-libsass"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsass-3.6.5.so.1 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
