SUMMARY = "Tool to analyze git deps - HTML parts"
DESCRIPTION = "Documentation for git-deps."
LICENSE = "GPL-2.0-only"

PV = "1.0.2+git.1559732444.7c75531"

RPM_NAME = "git-deps-html-1.0.2+git.1559732444.7c75531-4.4.noarch.rpm"
RPM_HASH = "cbfabf53f151ca89f44327b4be530384cc67ce9e5c66411327269a5f9106668f6ad8ebd33f954dbcddedcc3f27800b148260b704489f775cc444c8d009b366ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps-html"
RDEPENDS:${PN} += ""

inherit rpm
