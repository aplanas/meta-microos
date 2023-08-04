SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.21.0"

RPM_NAME = "kubie-fish-completion-0.21.0-1.1.noarch.rpm"
RPM_HASH = "807049e880721ac4f14049b9e31e13ce63419b086ea612053f2b9f6593e48ffdc8823251d048d2b8a60fd9c7fc06b6b4e72d5f25c4faadfd1988cf7eabeda9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
