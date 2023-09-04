SUMMARY = "Adapter to write and run CMPI-type CIM providers in Python 3"
DESCRIPTION = "-"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-py3wbem-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "60d9283e26af107081c32e435d94dcef93bf32f15df03632429076030719cd3e9785e2b937d985239b5f5480a51b7fb385f2f1ed1fb791e1a1ef80d84fff6abc"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-py3wbem \
libpy3CmpiProvider.so"

RDEPENDS:${PN} += "libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
python3"

inherit rpm
