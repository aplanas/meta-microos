SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python311-tsk-0~20210419-2.1.aarch64.rpm"
RPM_HASH = "e1800e56f7545743f31229e0a5ed43f77f3deae40f4f695c47f551729ee15ba756656706d0e8f374fd00f7dd44189965a062f8af1d62a9a4c77c8cf5cc377c37"

RPROVIDES:${PN} += "python3-tsk \
python3.11dist-pytsk3 \
python311-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
