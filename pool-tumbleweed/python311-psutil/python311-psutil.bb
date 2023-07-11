SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python311-psutil-5.9.5-1.3.aarch64.rpm"
RPM_HASH = "b27d2262656c80d0ed9738b8773ced31d6968379e4e541c1cfbb52e51227ac5d81496404f8766b49718bb08e2cb8e53379c9a5e55d910400b614a27d9c0bc3c8"

RPROVIDES:${PN} += "python3-psutil \
python3.11dist-psutil \
python311-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
