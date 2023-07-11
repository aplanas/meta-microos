SUMMARY = "Static libraries for the OpenLDAP libraries"
DESCRIPTION = "This package provides the static versions of the OpenLDAP libraries \
for development."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-devel-static-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "fe23bd6198dce6fd83e486b11c5f8da55c21a5eb1076ae1e95d61759e55553d668e33fc67cdb1a0520a70c4bbe7e89ffbd9bbeb05c970debab9300c1b2615000"

RPROVIDES:${PN} += "openldap2-devel-static"

RDEPENDS:${PN} += "cyrus-sasl-devel \
libopenssl-devel \
openldap2-devel"

inherit rpm
