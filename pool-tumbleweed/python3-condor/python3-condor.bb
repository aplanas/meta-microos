SUMMARY = "Python bindings for HTCondor."
DESCRIPTION = "The python bindings allow one to directly invoke the C++ implementations of \
the ClassAd library and HTCondor from python"
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "python3-condor-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "149e9d273c94f519983232ee36b72f5fecebf25302b31098f12920a34dade7da1a25345636e2f8ce79ba51e80844a30999c364cd02f4d2cbffc601f7d6a54b1f"

RPROVIDES:${PN} += "libclassad_python_user.cpython-310-aarch64-linux-gnu.so()(64bit) \
libcollector_python_plugin.cpython-310-aarch64-linux-gnu.so()(64bit) \
libpyclassad3.10_9_0_16.so()(64bit) \
python3-condor \
python3-condor(aarch-64) \
python3.10dist(htcondor) \
python3dist(htcondor)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libboost_python-py3.so.1.81.0()(64bit) \
libc.so.6()(64bit) \
libclassad.so.15()(64bit) \
libcondor_utils_9_0_16.so()(64bit) \
libgcc_s.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python3"

inherit rpm
