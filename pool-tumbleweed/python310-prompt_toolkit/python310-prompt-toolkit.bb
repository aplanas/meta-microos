SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.38"

RPM_NAME = "python310-prompt_toolkit-3.0.38-2.1.noarch.rpm"
RPM_HASH = "1da95bed35c9417a4179ed3a692081fc024e2e8e7521bdb794607ad06f229cc4267d36dab4683e671dde9b023fd5212ab32cf3a27562b009023839f01caacb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prompt_toolkit \
python3.10dist(prompt-toolkit) \
python310-prompt_toolkit \
python3dist(prompt-toolkit)"
RDEPENDS:${PN} += "python(abi) \
python310-wcwidth"

inherit rpm
