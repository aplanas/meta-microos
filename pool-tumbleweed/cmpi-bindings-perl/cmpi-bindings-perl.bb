SUMMARY = "Adapter to write and run CMPI-type CIM providers in Perl"
DESCRIPTION = "-"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-perl-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "8261117bbbd64e47383adeb4468e48976e4b9732af5fa4bd02a9eb076cf48d39f5ce92b6bfafac81f1f06ed51907242b63b347f74685130b8c0b869a36c45873"

RPROVIDES:${PN} += "cmpi-bindings \
cmpi-bindings-perl \
libplCmpiProvider.so \
perl-cmpi \
perl-cmpi--CMPIArgs \
perl-cmpi--CMPIArray \
perl-cmpi--CMPIBroker \
perl-cmpi--CMPIContext \
perl-cmpi--CMPIData \
perl-cmpi--CMPIDateTime \
perl-cmpi--CMPIEnumeration \
perl-cmpi--CMPIError \
perl-cmpi--CMPIException \
perl-cmpi--CMPIInstance \
perl-cmpi--CMPIMsgFileHandle \
perl-cmpi--CMPIObjectPath \
perl-cmpi--CMPIPredicate \
perl-cmpi--CMPIResult \
perl-cmpi--CMPISelectCond \
perl-cmpi--CMPISelectExp \
perl-cmpi--CMPIStatus \
perl-cmpi--CMPIString \
perl-cmpi--CMPISubCond \
perl-cmpi--CMPIValue \
perl-cmpi--CMPIValuePtr \
perl-cmpic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl"

inherit rpm
