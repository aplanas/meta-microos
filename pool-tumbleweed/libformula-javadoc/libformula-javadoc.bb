SUMMARY = "Javadoc for libformula"
DESCRIPTION = "Javadoc for libformula."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libformula-javadoc-1.1.6-1.4.noarch.rpm"
RPM_HASH = "d36e057dc356654397770d8b0cdd98b83e587fe67f49aa654415ae4f261f963e0eacb3e56eeb1e30b3d75b1ac79830cb88f82cce9703e816554640fcfa0041dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libformula-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
