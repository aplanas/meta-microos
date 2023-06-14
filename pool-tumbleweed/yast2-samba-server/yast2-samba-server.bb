SUMMARY = "YaST2 - Samba Server Configuration"
DESCRIPTION = "This package contains the YaST2 component for Samba server \
configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-samba-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "d22de466b049e75b1f5f1468fce7e67a32d6292c6e55747d125265acfd4bdd0008835ec6f987d43a58be808a8552dc1e1b9ac3fa6e4878acfc7165093a2ee525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SambaAccounts \
perl-SambaBackend \
perl-SambaBackendLDAP \
perl-SambaBackendSimple \
perl-SambaPrinters \
perl-SambaRole \
perl-SambaSecrets \
perl-SambaServer \
perl-SambaService \
perl-SambaTrustDom \
perl-UsersPluginSamba \
perl-UsersPluginSambaGroups \
perl-YaPI--Samba \
yast2-samba-server"

RDEPENDS:${PN} += "perl-Crypt-SmbHash \
yast2 \
yast2-ldap \
yast2-network \
yast2-perl-bindings \
yast2-ruby-bindings \
yast2-samba-client \
yast2-users"

inherit rpm
