SUMMARY = "A tool for creating identity management server instances"
DESCRIPTION = "The program assists system administrators to create new directory server and \
Kerberos server instances that help to maintain centralised user identity \
database for a network."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.2"

RPM_NAME = "yast2-auth-server-4.6.2-1.1.noarch.rpm"
RPM_HASH = "f29a154d6d9d03037433abdba9325ce4ccced98e8bcba6e9822e4c3f6505047cb55613f32eced2145a95f342ca98caeb6d35117af204c6e6e8b5064e43914643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.LDAPServer.desktop) \
metainfo() \
metainfo(org.opensuse.yast.LDAPServer.metainfo.xml) \
yast2-auth-server"

RDEPENDS:${PN} += "net-tools \
yast2 \
yast2-ruby-bindings"

inherit rpm
