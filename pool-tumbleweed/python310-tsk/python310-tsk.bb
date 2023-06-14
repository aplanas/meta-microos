SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python310-tsk-0~20210419-1.8.aarch64.rpm"
RPM_HASH = "72c0179f827049380d52770059ff3ad699380b0fc7c7ebcd31b2e6928c1ec558707045002f8e5766361f7046b3782486a3809975f810e49348fb86c28df9a9ab"

RPROVIDES:${PN} += "python3-tsk \
python3.10dist-pytsk3 \
python310-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
