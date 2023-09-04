SUMMARY = "Adapter to write and run CMPI-type CIM providers in Perl"
DESCRIPTION = "-"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "1.0.4"

RPM_NAME = "cmpi-bindings-perl-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "936a71bde13d3af0f1e5a2354a164fa92f083866ba615c1a3e4b8360c914a9a9603ed7aebcd98062cf5b29a63f887f1d35135759fbacd2a3ea1d7de52c5c1ac5"

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
