SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python311-libsass-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "9535039579cee666f49974e8a1feba53ed723bb8d8c687c7c508ac0faa06b9b8734ed611adcc4790f4862038953fb74c294574124a976275f6a1a559505e55f9"

RPROVIDES:${PN} += "python3.11dist-libsass \
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
