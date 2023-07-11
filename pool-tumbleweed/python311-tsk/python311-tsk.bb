SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python311-tsk-0~20210419-1.11.aarch64.rpm"
RPM_HASH = "3677b00b66f3d9366d3041b007f3c10efc05f9970ccc7efc8da3d989436fb56e4f2ba6a6f3ba95b921055e37b91c8e8d1887f3e4d683de0fdbf4c74cc1cd9bcf"

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
