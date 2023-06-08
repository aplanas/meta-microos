SUMMARY = "Fish completion for gh"
DESCRIPTION = "Fish command line completion support for gh."
LICENSE = "MIT"

PV = "2.28.0"

RPM_NAME = "gh-fish-completion-2.28.0-1.1.noarch.rpm"
RPM_HASH = "04c08ce39cce0e83fb19f7de801915ea75ad5ecfded027dd163126e92c6b098d45911004347192c2bd28c8a01c585cb037c0446cda650a3b94b1d13fee9f2e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-fish-completion"
RDEPENDS:${PN} += "gh"

inherit rpm
