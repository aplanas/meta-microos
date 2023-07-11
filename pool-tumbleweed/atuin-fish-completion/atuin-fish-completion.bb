SUMMARY = "Fish completion for atuin"
DESCRIPTION = "Fish command line completion support for atuin."
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "atuin-fish-completion-15.0.0-1.1.noarch.rpm"
RPM_HASH = "0d83811a342eedcc43ab701b13d847359f2a797704ecf296cb3d1f720e34da23b8dfdd3a1b3296187dd8d0a9ef2b36bf14989dc146d105f19c990fee00a3b97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-fish-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
