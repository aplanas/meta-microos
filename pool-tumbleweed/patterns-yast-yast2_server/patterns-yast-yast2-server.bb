SUMMARY = "YaST Server Utilities"
DESCRIPTION = "YaST tools for server system administration."
LICENSE = "MIT"

PV = "20220411"

RPM_NAME = "patterns-yast-yast2_server-20220411-1.4.aarch64.rpm"
RPM_HASH = "be97e7d505f2d9a9bf55e8876d42c12618ddd74cd99c97326c0669ee53e8389f328aba71bff4045c7f2ca9b5823d626f0a05790ab8171697028d8bd3121661be"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-yast2-server"

RDEPENDS:${PN} += "yast2-installation \
yast2-ldap \
yast2-mail \
yast2-network \
yast2-security \
yast2-services-manager \
yast2-sysconfig \
yast2-transfer \
yast2-tune \
yast2-users"

inherit rpm
