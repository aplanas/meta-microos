SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.38"

RPM_NAME = "python311-prompt_toolkit-3.0.38-2.3.noarch.rpm"
RPM_HASH = "f4b32165a67893e3cff2b3b691183cb37a84a27f468b9e6c0bf0237b282910bbc6b2c5dc15792c9ee333fe25d93c43aaf53889252a4db16f908195d0cf8453cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prompt-toolkit \
python3.11dist-prompt-toolkit \
python311-prompt-toolkit \
python3dist-prompt-toolkit"

RDEPENDS:${PN} += "python-abi \
python311-wcwidth"

inherit rpm
