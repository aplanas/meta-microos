SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python39-tsk-0~20210419-1.11.aarch64.rpm"
RPM_HASH = "fab98d00b2fc4a92785750d2661ff883663eb338e60ffae2398c23f3e826ab36325e6e4148d18a26619de25be99a682217b0159516e70c8b1d5b9ec3b70c0d98"

RPROVIDES:${PN} += "python3.9dist-pytsk3 \
python39-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
