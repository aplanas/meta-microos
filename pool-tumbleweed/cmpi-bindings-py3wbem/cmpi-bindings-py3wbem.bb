SUMMARY = "Adapter to write and run CMPI-type CIM providers in Python 3"
DESCRIPTION = "-"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-py3wbem-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "0af0375877ce7cd020630935f1967bb6a612f64e361ccae23e480ac2c8503c568406819bf32bec49cb76c8e5ba49f42bdaa97591d08daae452c9cd6bcbcb01a7"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-py3wbem \
libpy3CmpiProvider.so"

RDEPENDS:${PN} += "libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
python3"

inherit rpm
