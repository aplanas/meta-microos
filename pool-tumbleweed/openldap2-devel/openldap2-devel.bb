SUMMARY = "Libraries, Header Files and Documentation for OpenLDAP"
DESCRIPTION = "This package provides the OpenLDAP libraries, header files, and \
documentation."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-devel-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "d9da8f6f03a84e530d599d24141b1ab9d23d1f5f442581ea171d9926de5165fa26bcbe10a280ae2ebab750385a80a6222bdac7c3c3672550559a880d81179ea8"

RPROVIDES:${PN} += "openldap2-devel \
pkgconfig-lber \
pkgconfig-ldap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldap2 \
pkgconfig-lber"

inherit rpm
