SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python310-tsk-0~20210419-1.11.aarch64.rpm"
RPM_HASH = "0c679a522637502897168536e78a75b8a02f5fd64dac71db057e1bb51cf44f9d17f8e1cb12df724652a622a631817fb315decdd65d34ee0c6066cc73b5176352"

RPROVIDES:${PN} += "python3.10dist-pytsk3 \
python310-tsk \
python3dist-pytsk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
