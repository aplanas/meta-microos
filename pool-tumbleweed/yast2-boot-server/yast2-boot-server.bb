SUMMARY = "YaST2 - Network Booting and Wake-On-Lan Configuration"
DESCRIPTION = "YaST2 module for network booting and Wake-On-Lan."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-boot-server-4.6.0-1.1.noarch.rpm"
RPM_HASH = "ef4cc8395147b8e89d1a2ed99f962371237bef28ab18570ca2b8fd7ea592b2b48f479dac40aeaec701b075a7594de6a02a7366a6c8b45cc3e2f938e44f5e47c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-boot-server"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
