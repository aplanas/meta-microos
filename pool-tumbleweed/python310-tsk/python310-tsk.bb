SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python310-tsk-0~20210419-2.1.aarch64.rpm"
RPM_HASH = "b7557120a3b7b631cc9c17964aef78f9d85f757438752fb960844ceea61bab7287ad035560b33015f3cdc943aefcdee5fd87b24e79232d610b164d720d7ed58e"

RPROVIDES:${PN} += "python3.10dist-pytsk3 \
python310-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
