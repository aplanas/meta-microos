SUMMARY = "YaST2 - Centralised System Authentication Configuration"
DESCRIPTION = "With this YaST2 module you may configure centralised system authentication, on a single or multipe network domains."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-auth-client-4.6.1-1.1.noarch.rpm"
RPM_HASH = "cc8522c695e16a12bea4c4172e96e6fa127af46bafcca29454fef5e235b9e899ce036fdae8a653e01bf7a19d73d83738c8bbfbd20128a7b34488bdc1025e3662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.AuthClient.desktop) \
metainfo() \
metainfo(org.opensuse.yast.AuthClient.metainfo.xml) \
yast2-auth-client"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/touch \
fillup \
net-tools \
yast2 \
yast2-pam \
yast2-ruby-bindings"

inherit rpm
