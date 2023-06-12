SUMMARY = "Python bindings for tsk - The SleuthKit"
DESCRIPTION = "The Sleuthkit is a forensic filesystem analysis framework (http://www.sleuthkit.org/). This project is a python 3 binding for the sleuthkit."
LICENSE = "Apache-2.0 & LGPL-3.0-or-later"

PV = "0~20210419"

RPM_NAME = "python310-tsk-0~20210419-1.8.aarch64.rpm"
RPM_HASH = "72c0179f827049380d52770059ff3ad699380b0fc7c7ebcd31b2e6928c1ec558707045002f8e5766361f7046b3782486a3809975f810e49348fb86c28df9a9ab"

RPROVIDES:${PN} += "python3-tsk \
python3.10dist(pytsk3) \
python310-tsk \
python310-tsk(aarch-64) \
python3dist(pytsk3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
