SUMMARY = "Python bindings for HTCondor."
DESCRIPTION = "The python bindings allow one to directly invoke the C++ implementations of \
the ClassAd library and HTCondor from python"
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "python3-condor-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "149e9d273c94f519983232ee36b72f5fecebf25302b31098f12920a34dade7da1a25345636e2f8ce79ba51e80844a30999c364cd02f4d2cbffc601f7d6a54b1f"

RPROVIDES:${PN} += "libclassad-python-user.cpython-310-aarch64-linux-gnu.so \
libcollector-python-plugin.cpython-310-aarch64-linux-gnu.so \
libpyclassad3.10-9-0-16.so \
python3-condor \
python3.10dist-htcondor \
python3dist-htcondor"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.81.0 \
libc.so.6 \
libclassad.so.15 \
libcondor-utils-9-0-16.so \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python3"

inherit rpm
