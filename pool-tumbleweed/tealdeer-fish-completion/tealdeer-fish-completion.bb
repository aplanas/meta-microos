SUMMARY = "Fish Completion for tealdeer"
DESCRIPTION = "Fish command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.6.1"

RPM_NAME = "tealdeer-fish-completion-1.6.1-2.3.noarch.rpm"
RPM_HASH = "62467954e8824708e1e5f2db923a9afb773802bdfeca8dffa53445ee818cc2f590c1ee3f2e9a5a42dcc155e443f476d568032c8d4a050893b0c3f61b58f3f1f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
