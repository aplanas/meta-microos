SUMMARY = "Adapter to write and run CMPI-type CIM providers in Python 3"
DESCRIPTION = "-"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-py3wbem-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "dcf3ff57e757e03fbf13aae0938eb38d11c888df3736c41869f2fafb8b50ae7d2b2667a97881244537459bf2c1a4c714488cc867dd80e56dc8822af164f5fcf9"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-py3wbem \
cmpi-bindings-py3wbem(aarch-64) \
libpy3CmpiProvider.so()(64bit)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libpython3.10.so.1.0()(64bit) \
python(abi) \
python3"

inherit rpm
