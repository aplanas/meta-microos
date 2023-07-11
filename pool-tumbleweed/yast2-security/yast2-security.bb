SUMMARY = "YaST2 - Security Configuration"
DESCRIPTION = "The YaST2 component for security settings configuration."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-security-4.6.0-1.2.noarch.rpm"
RPM_HASH = "328c893b96a717a649d90b1d03cc0c6c36970fa19b0cc437ef5cf8d8d5701d7689472ae9397d16724ea2a1f677a4e8e58a14332e8fcb232cd6101425dcdef9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "y2c-sec \
y2t-sec \
yast2-config-security \
yast2-security \
yast2-trans-security"

RDEPENDS:${PN} += "/usr/bin/sh \
augeas-lenses \
yast2 \
yast2-bootloader \
yast2-network \
yast2-pam \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
