SUMMARY = "YaST2 - Firewall Configuration"
DESCRIPTION = "A YaST2 module to be used for configuring a firewall."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-firewall-4.6.0-1.1.noarch.rpm"
RPM_HASH = "f7c5934c9b91ebc18c8a2f612a3dacb7db287dcc0880f0560fa7d583a8e14071b056ed96b5ba3ea37c6fb5aae16a4416aa74529fb74fe2a6d5159d5754fee6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Firewall.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Firewall.metainfo.xml) \
yast2-config-firewall \
yast2-firewall \
yast2-trans-firewall"
RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
