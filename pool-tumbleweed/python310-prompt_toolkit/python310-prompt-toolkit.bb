SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.38"

RPM_NAME = "python310-prompt_toolkit-3.0.38-2.3.noarch.rpm"
RPM_HASH = "b36d64e8bcbb5d58c09bb36a5eb9c86bf2007fe7bcfa1f5bf889717c75cef5b453a6ca447ec465b643c3eda376734a0ac867353a97924c912d1e00fb76eeb70a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-prompt-toolkit \
python310-prompt-toolkit \
python3dist-prompt-toolkit"

RDEPENDS:${PN} += "python-abi \
python310-wcwidth"

inherit rpm
