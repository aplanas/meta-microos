SUMMARY = "YaST2 - Plugins for AppArmor Profile Management"
DESCRIPTION = "YaST2 forms and components for the management of AppArmor \
profiles."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-apparmor-4.6.2-1.1.noarch.rpm"
RPM_HASH = "abfc024552f303b7d1b7f3a9d0ff98156eca175398b6845a82d903672b5fa302af436b53aab9e8657e86455dc9d8f663568dadb30c69f0d5b6420eb0d5ee1b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-apparmor"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
