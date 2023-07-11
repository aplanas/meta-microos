SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python310-libsass-0.22.0-2.1.aarch64.rpm"
RPM_HASH = "88101840b99727978b466e9e579e1fe0c16a92a476c10f21106f9cd1c76a2a8e6825b89626813b9db937655324f1f131472158e8bedec86b2fafd32d2d222190"

RPROVIDES:${PN} += "python3.10dist-libsass \
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
