SUMMARY = "Fish completion for glab"
DESCRIPTION = "Fish command line completion support for glab."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "glab-fish-completion-1.31.0-1.1.noarch.rpm"
RPM_HASH = "f01af04a3d7ef510653923f64aa962e6a7baafda254417fe968a4922ebde35bb7abee32374bf9492b51c102561d9270f6c81a248bf770bf330cfa0c8530aca48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-fish-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
