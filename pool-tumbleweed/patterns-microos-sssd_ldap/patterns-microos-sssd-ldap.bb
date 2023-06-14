SUMMARY = "LDAP client"
DESCRIPTION = "Packages required to enable LDAP client support via sssd on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-sssd_ldap-5.0-70.1.aarch64.rpm"
RPM_HASH = "c5ba5673aaa6982f39ca61bccd3b464e3b8e1bdf68f90e2bfb3d7e0e904fa5ee741eac1d6fec8e24954f83dd5685ae1bab5a21e951d287b1aca6cd76c291c266"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-sssd-ldap"

RDEPENDS:${PN} += "sssd \
sssd-ldap"

inherit rpm
