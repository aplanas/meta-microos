SUMMARY = "Utility to re-format docstrings per PEP 257"
DESCRIPTION = "Docformatter currently automatically formats docstrings to follow a \
subset of the PEP 257 conventions. Below are the relevant items quoted \
from PEP 257. \
 \
- For consistency, always use triple double quotes around docstrings. \
- Triple quotes are used even though the string fits on one line. \
- Multi-line docstrings consist of a summary line just like a one-line \
  docstring, followed by a blank line, followed by a more elaborate \
  description. \
- The BDFL recommends inserting a blank line between the last paragraph \
  in a multi-line docstring and its closing quotes, placing the closing \
  quotes on a line by themselves. \
 \
docformatter also handles some of the PEP 8 conventions. \
 \
- Don't write string literals that rely on significant trailing \
  whitespace. Such trailing whitespace is visually indistinguishable \
  and some editors (or more recently, reindent.py) will trim them."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-docformatter-1.4-1.11.noarch.rpm"
RPM_HASH = "c609f7114f424a6921dcad49fccadca7b2aa8d40f20b162c62856bae594361c71e706b814a338aa42dfbbf511d92099f00ca0359d0b0285da54655cacaa97d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docformatter \
python3.11dist-docformatter \
python311-docformatter \
python3dist-docformatter"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
python311-untokenize \
update-alternatives"

inherit rpm
