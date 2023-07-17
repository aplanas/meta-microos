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

RPM_NAME = "python310-keyring-keyutils-0.1.1-2.1.aarch64.rpm"
RPM_HASH = "ad7a9d521e2ca7be1c308a4a41f2a086789f0de247d7ef3a578b1eaf4b75e965c8b8178cdb21c67a86af80cd1198b17d1d42a817d071a729b167ee1ca879af43"

RPROVIDES:${PN} += "python3.10dist-keyring-keyutils \
python310-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
