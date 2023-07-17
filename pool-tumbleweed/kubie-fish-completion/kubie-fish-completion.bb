SUMMARY = "Fish Completion for kubie"
DESCRIPTION = "Fish command line completion support for kubie."
LICENSE = "Zlib"

PV = "0.20.0"

RPM_NAME = "kubie-fish-completion-0.20.0-1.1.noarch.rpm"
RPM_HASH = "863202c658067a1402dbdda12a6894217cce51194d4f34a9067bb86621d03e3e923c7fafe535872ec573844ffbdc703c1173d69af74c62e3a7925e1630c2cefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubie-fish-completion"

RDEPENDS:${PN} += "kubie"

inherit rpm
