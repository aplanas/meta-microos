SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.38"

RPM_NAME = "python39-prompt_toolkit-3.0.38-2.1.noarch.rpm"
RPM_HASH = "8e0a274182ceccdc2a13ae754d0cbe77e5e1129ead4f2c64275a59b40c59eb2742460d12a28ee47d82715169324da74d1ef78dfd925bf5cad8f085a6771ef7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(prompt-toolkit) \
python39-prompt_toolkit \
python3dist(prompt-toolkit)"

RDEPENDS:${PN} += "python(abi) \
python39-wcwidth"

inherit rpm
