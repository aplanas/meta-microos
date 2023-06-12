SUMMARY = "YaST2 - Security Configuration"
DESCRIPTION = "The YaST2 component for security settings configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-security-4.6.0-1.1.noarch.rpm"
RPM_HASH = "ab9e8ee476ed5dfbb8683a897bc3e6405bc76d5bd3d9ee11a805498b8e5499199c6420ab3810088467622c75c2623d2aa5033d06df37ec004d891bd2203e34b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Security.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Security.metainfo.xml) \
y2c_sec \
y2t_sec \
yast2-config-security \
yast2-security \
yast2-trans-security"
RDEPENDS:${PN} += "/bin/sh \
augeas-lenses \
yast2 \
yast2-bootloader \
yast2-network \
yast2-pam \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
