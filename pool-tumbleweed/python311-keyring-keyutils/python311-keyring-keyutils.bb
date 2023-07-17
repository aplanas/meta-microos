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

RPM_NAME = "python311-keyring-keyutils-0.1.1-2.1.aarch64.rpm"
RPM_HASH = "4dce6d0d85def7d3a94be104e9399e43010233dd50b1da643364073413033a927cc7286e0d6576a66896f8b149326c3def19d9624a35abff9105af65ccee71a4"

RPROVIDES:${PN} += "python3-keyring-keyutils \
python3.11dist-keyring-keyutils \
python311-keyring-keyutils \
python3dist-keyring-keyutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkeyutils.so.1 \
python-abi"

inherit rpm
