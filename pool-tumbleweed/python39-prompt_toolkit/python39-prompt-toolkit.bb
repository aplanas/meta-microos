SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.38"

RPM_NAME = "python39-prompt_toolkit-3.0.38-2.3.noarch.rpm"
RPM_HASH = "f582ade16099c6ab280a91f0c9a2a9ee2c4188a5a2da761333ab4e43c8ad70df744b37c4e620dbde785f65b6ade1d383d00c8a124853190fe3c40919d703899a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-prompt-toolkit \
python39-prompt-toolkit \
python3dist-prompt-toolkit"

RDEPENDS:${PN} += "python-abi \
python39-wcwidth"

inherit rpm
