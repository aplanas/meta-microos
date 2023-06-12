SUMMARY = "YaST2 - Multipath Configuration"
DESCRIPTION = "Multipath I/O is a fault tolerance technique whereby there is more than \
one physical path between the CPU in a computer system and its mass \
storage devices through the buses, controllers, switches, and bridge \
devices connecting them. \
 \
You can configure your multipathed devices with this module."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-multipath-4.6.0-1.1.noarch.rpm"
RPM_HASH = "eabe9dbf64a7cb2e357ed80760dfa4e6cf33ba6027ee53c24f9eeea68bfb3740aed02736694122d4bcc0b71397cb12404cdc69b7bd3aedd27ea2e754e8d4a52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Multipath.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Multipath.metainfo.xml) \
yast2-multipath"
RDEPENDS:${PN} += "/usr/bin/python3 \
yast2 \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
