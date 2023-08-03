SUMMARY = "A python-keyring backend for the kernel keyring"
DESCRIPTION = "A python-keyring [1] backend that can be used to access the kernel \
keyring. In particular, this package ships \
 \
- a python-keyring [1] backend for the kernel keyring \
- a special python-keyring backend that can be used by osc \
- a high-level interface to the kernel keyring \
- a low-level module that wraps around the C keyutils library [2] \
 \
[1] https://github.com/jaraco/keyring \
[2] https://git.kernel.org/pub/scm/linux/kernel/git/dhowells/keyutils.git"
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python39-keyring-keyutils-0.1.1-3.1.aarch64.rpm"
RPM_HASH = "bda5e5c0794e7cba7862cd3d3264b39262e8b9d75d4048fa1b2abc5069094329330f619bdff774858dcbaa02572da50e6de5066236d86c7197e17f0e49bd0f05"

RPROVIDES:${PN} += "python3.9dist-keyring-keyutils \
python39-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
