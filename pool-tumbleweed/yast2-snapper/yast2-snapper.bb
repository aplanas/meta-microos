SUMMARY = "YaST - file system snapshots review"
DESCRIPTION = "YaST module for accessing and managing file-system snapshots"
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-snapper-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "4618821242316a6c235e207365ee06f3848705bc0650ce022cc216dd84c808079d65d08ccf5ab28e84cc6b5e3b2cd5992aee01753b947c00ea4d5de94d2a1aad"

RPROVIDES:${PN} += "yast2-snapper"

RDEPENDS:${PN} += "rubygem-ruby-3.2.0-ruby-dbus \
snapper \
yast2 \
yast2-ruby-bindings"

inherit rpm
