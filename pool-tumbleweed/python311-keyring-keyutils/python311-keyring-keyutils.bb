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

RPM_NAME = "python311-keyring-keyutils-0.1.1-1.12.aarch64.rpm"
RPM_HASH = "43711dae9a41b03985942873cd704f45bb3b1677419a642d1172031a4bf611930b406779a016c4a085126ba71fd35981463c4b3a344c16086df9dcf2ca78c4b1"

RPROVIDES:${PN} += "python3-keyring-keyutils \
python3.11dist-keyring-keyutils \
python311-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
