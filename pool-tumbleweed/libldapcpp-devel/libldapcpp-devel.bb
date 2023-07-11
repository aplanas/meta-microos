SUMMARY = "C++ wrapper around openLDAP API"
DESCRIPTION = "This package contains files needed for development with the LDAP C++ \
library."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldapcpp-devel-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "d2d4f509786d31eb456da88b6644671307b6166252deda5d857c5ccd8ea69aa26c3da946799eb748fd5ea861645bc38cb9dbb98602c412bf4d0c0790d961a395"

RPROVIDES:${PN} += "libldapcpp-devel"

RDEPENDS:${PN} += "libldapcpp0 \
openldap2-devel"

inherit rpm
