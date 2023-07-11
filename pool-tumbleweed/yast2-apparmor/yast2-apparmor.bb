SUMMARY = "YaST2 - Plugins for AppArmor Profile Management"
DESCRIPTION = "YaST2 forms and components for the management of AppArmor \
profiles."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-apparmor-4.6.1-1.1.noarch.rpm"
RPM_HASH = "7a00ba604b06c65f2429ab705e8e19224ffc31920619e4c5d815710b2c8d91d24340ab94da90b77825064b777fea23a9a0be10c0b9bbc78a1470c0ed75f0da4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-apparmor"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
