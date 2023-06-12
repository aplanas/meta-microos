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

RPM_NAME = "python310-docformatter-1.4-1.9.noarch.rpm"
RPM_HASH = "358ce8fd2a7f93fd137993351efe803a7cc6059eeb83acb7a64f1b5c38f2eac547e713835aa759144b75704708b8f15bb98e071b67635d1a715ffd13052cce42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docformatter \
python3.10dist(docformatter) \
python310-docformatter \
python3dist(docformatter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
python310-untokenize \
update-alternatives"

inherit rpm
