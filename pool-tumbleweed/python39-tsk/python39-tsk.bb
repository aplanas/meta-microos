SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python39-tsk-0~20210419-2.1.aarch64.rpm"
RPM_HASH = "1d9df78cbf56358e0ffe29607bec4581afa28ea79120369cf2a573d32693a3b0467ebffec819531b21ed7fa241e70951604d08d768aa56894400c21197fdbfdc"

RPROVIDES:${PN} += "python3.9dist-pytsk3 \
python39-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
