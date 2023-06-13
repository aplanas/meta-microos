SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python311-tsk-0~20210419-1.8.aarch64.rpm"
RPM_HASH = "64999ba4aaf13f0db3aff33af003bfdb61e76c773909ffb69d36450c437dac3d29c68486f0ed564ce4be50aef03acf58385dd9b51318ff7637d2f2aee6a89a89"

RPROVIDES:${PN} += "python3.11dist(pytsk3) \
python311-tsk \
python311-tsk(aarch-64) \
python3dist(pytsk3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
