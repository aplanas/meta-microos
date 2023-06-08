SUMMARY = "Adapter to write and run CMPI-type CIM providers in Perl"
DESCRIPTION = "-"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-perl-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "47ed1d6134e528a15b3867e5cc20bdc73c3dd183a1419f0ab37ceb37c5c70eef730dc0689c589faf0ed79a02c5d9b850b7c1d83302c2c3d977a6e21a58b4f8ae"

RPROVIDES:${PN} += "cmpi-bindings cmpi-bindings-perl cmpi-bindings-perl(aarch-64) libplCmpiProvider.so()(64bit) perl(cmpi) perl(cmpi::CMPIArgs) perl(cmpi::CMPIArray) perl(cmpi::CMPIBroker) perl(cmpi::CMPIContext) perl(cmpi::CMPIData) perl(cmpi::CMPIDateTime) perl(cmpi::CMPIEnumeration) perl(cmpi::CMPIError) perl(cmpi::CMPIException) perl(cmpi::CMPIInstance) perl(cmpi::CMPIMsgFileHandle) perl(cmpi::CMPIObjectPath) perl(cmpi::CMPIPredicate) perl(cmpi::CMPIResult) perl(cmpi::CMPISelectCond) perl(cmpi::CMPISelectExp) perl(cmpi::CMPIStatus) perl(cmpi::CMPIString) perl(cmpi::CMPISubCond) perl(cmpi::CMPIValue) perl(cmpi::CMPIValuePtr) perl(cmpic)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libperl.so()(64bit) perl"

inherit rpm
