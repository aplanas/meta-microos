SUMMARY = "Fish Completion for fuzzel"
DESCRIPTION = "Fish command-line completion support for fuzzel."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "fuzzel-fish-completion-1.9.1-2.1.noarch.rpm"
RPM_HASH = "b765b477024a07363fea0d4b113f4842f9289b0720057411f833ea9a1c81ed96549d1e11e6b87fc082e3307fb2c5c07eccbeb1fe19cce1b72cdebaad116f77cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fuzzel-fish-completion"
RDEPENDS:${PN} += "fish"

inherit rpm
