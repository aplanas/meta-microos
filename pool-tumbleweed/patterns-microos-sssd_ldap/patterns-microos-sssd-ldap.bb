SUMMARY = "LDAP client"
DESCRIPTION = "Packages required to enable LDAP client support via sssd on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-sssd_ldap-5.0-72.1.aarch64.rpm"
RPM_HASH = "ce515a2b70e4b0a3b569415831e0d01e3f45a58097f693b89abd4b78b70721f51a04b52ea2a5ac69fb8cee997ffee0090f1f1682c13f98f16bffecc71e9a87c7"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-sssd-ldap"

RDEPENDS:${PN} += "sssd \
sssd-ldap"

inherit rpm
