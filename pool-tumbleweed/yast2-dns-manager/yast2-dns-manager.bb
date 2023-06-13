SUMMARY = "Samba Internal DNS Manager"
DESCRIPTION = "DNS Manager for the Internal Samba Active Directory Domain Controller DNS server."
LICENSE = "GPL-3.0-only"

PV = "0.1"

RPM_NAME = "yast2-dns-manager-0.1-1.14.noarch.rpm"
RPM_HASH = "69cba7df7f52176cd7e60b98cc2624c767f72a1a934ae1a8baa990a9e54fa88adc2734c27bc653cc7d7cb3c204eef6cfd9f27ff63c3cef4c2ce78e04568d44db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.DNS-MANAGER.desktop) \
metainfo() \
metainfo(org.opensuse.yast.DNS-MANAGER.metainfo.xml) \
yast2-dns-manager"

RDEPENDS:${PN} += "krb5-client \
samba-client \
samba-python3 \
yast2 \
yast2-adcommon-python \
yast2-python3-bindings"

inherit rpm
