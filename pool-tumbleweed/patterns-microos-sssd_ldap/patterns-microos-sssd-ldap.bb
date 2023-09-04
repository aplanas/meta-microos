SUMMARY = "LDAP client"
DESCRIPTION = "Packages required to enable LDAP client support via sssd on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-sssd_ldap-5.0-73.1.aarch64.rpm"
RPM_HASH = "959340d342b22e78e78a9f642574eb86f53c669cc4f11efa6e8b29dd4edb291b10edaa92d4bffc4a5a52d43898f622e618be584936000e9399145de1221edec5"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-sssd-ldap"

RDEPENDS:${PN} += "sssd \
sssd-ldap"

inherit rpm
