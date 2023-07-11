SUMMARY = "Configuration file for system-wide defaults for all uses of libldap"
DESCRIPTION = "The subpackage contains a configuration file used to set system-wide defaults \
to be applied with all usages of libldap."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldap-data-2.6.4-2.1.noarch.rpm"
RPM_HASH = "1030123b1e7468b1a3c73e2a62155b22682ba642216636ef021394313c91073bef8a19db56cf044b6b16ea476e20a0b6fba8d2f6b9d316968015f7c49f6f30a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libldap-data \
libldap-data"

RDEPENDS:${PN} += ""

inherit rpm
