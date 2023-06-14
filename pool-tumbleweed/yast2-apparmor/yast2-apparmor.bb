SUMMARY = "YaST2 - Plugins for AppArmor Profile Management"
DESCRIPTION = "YaST2 forms and components for the management of AppArmor \
profiles."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-apparmor-4.6.0-1.1.noarch.rpm"
RPM_HASH = "452435b9c2348157c294afd805feadc4b9bc8b92e274558010712d3e3a2200ff3803b8a1d4eb7e1b9257ed7fc6ce0854e7fbef20d87b99f7968203fad4a9d60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-apparmor"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
