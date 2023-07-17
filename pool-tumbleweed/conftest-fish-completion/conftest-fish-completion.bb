SUMMARY = "Fish Completion for conftest"
DESCRIPTION = "Fish command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.44.1"

RPM_NAME = "conftest-fish-completion-0.44.1-1.1.noarch.rpm"
RPM_HASH = "d4ce9fba6b7ff3a422b38b908a2bca52654335d5d4d5df57ba6bee849fd5899db279f957034f6c71edf540d94b4b0db1812acf1cb4465713da114692982df4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-fish-completion"

RDEPENDS:${PN} += "conftest"

inherit rpm
