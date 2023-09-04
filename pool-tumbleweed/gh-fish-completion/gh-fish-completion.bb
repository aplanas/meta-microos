SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.33.0"

RPM_NAME = "gh-fish-completion-2.33.0-1.1.noarch.rpm"
RPM_HASH = "e9a7ff1629380e1e23ef45dae0180b370aa1f93487c716c5169e3391dce3e1e8be1c89140c724d3be4ceef39fa677097e8d9ec191557c11a87763bc20d221aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
