SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python39-tsk-0~20210419-1.8.aarch64.rpm"
RPM_HASH = "b5d726c790e52db6cc119ddf458dba8fcad42a1746e0b2c894a9a2b707c7012084457a51edc856dd9a64db368401b55dc0c7c1ed6dd30d9cf37ddbf7173afdda"

RPROVIDES:${PN} += "python3.9dist-pytsk3 \
python39-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
