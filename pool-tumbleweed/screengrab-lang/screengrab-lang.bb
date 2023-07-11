SUMMARY = "Translations for package screengrab"
DESCRIPTION = "Provides translations for the 'screengrab' package."
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "screengrab-lang-2.6.0-1.2.noarch.rpm"
RPM_HASH = "b3f89753461309c2d5e0bf95751b2247f7752d87d0d5410734b09fc2a05b3f0f4082abd3fb34256dc9aa15d606f41bc2036e14ed33d292c196b43f7fec4ba8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "screengrab-lang \
screengrab-lang-all"

RDEPENDS:${PN} += "screengrab"

inherit rpm
