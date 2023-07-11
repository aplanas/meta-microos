SUMMARY = "Adapter to write and run CMPI-type CIM providers in Ruby"
DESCRIPTION = "Adapter to write and run CMPI-type CIM providers in Ruby"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-ruby-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "0720213fe8a83480f058d770dcc748a9d4fd882500036242bed75d44ae258116cbb311c217728d345713c5f57a0f9ab10a82f3542459bcd6b4be0eef6c5ea5ea"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-ruby \
librbCmpiProvider.so"

RDEPENDS:${PN} += "libc.so.6 \
libruby3.2.so.3.2"

inherit rpm
