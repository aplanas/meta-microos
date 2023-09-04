SUMMARY = "Adapter to write and run CMPI-type CIM providers in Ruby"
DESCRIPTION = "Adapter to write and run CMPI-type CIM providers in Ruby"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-ruby-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "adebd3164c820b00025c7b11ae0ff4aa9e99eb32a223bd541d00f3d33f359e50779f34ee04f93f817ce14f850f697fda88ab741a11cfa95090e9abd81a63ba53"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-ruby \
librbCmpiProvider.so"

RDEPENDS:${PN} += "libc.so.6 \
libruby3.2.so.3.2"

inherit rpm
