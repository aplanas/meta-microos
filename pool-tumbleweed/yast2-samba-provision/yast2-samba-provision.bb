SUMMARY = "YaST2 - Samba AD DC provision"
DESCRIPTION = "This package contains the YaST2 component to configure samba as an Active \
Directory Domain Controller."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "yast2-samba-provision-1.0.5-1.8.noarch.rpm"
RPM_HASH = "6ccc0ef1c2414ddc187f9e17b73361590cd1785d89aba3a864279c2eb2569e01e32226ae2e265f17bef356205d56c416bced99a9f4349d064cb86ae22439e8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.SambaProvision.desktop) \
metainfo() \
metainfo(org.opensuse.yast.SambaProvision.metainfo.xml) \
yast2-samba-provision"

RDEPENDS:${PN} += "yast2 \
yast2-network \
yast2-python3-bindings \
yast2-ruby-bindings"

inherit rpm
