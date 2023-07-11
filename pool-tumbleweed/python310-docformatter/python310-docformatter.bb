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

RPM_NAME = "python310-docformatter-1.4-1.11.noarch.rpm"
RPM_HASH = "c4e460b84a74e5aac0bbe4d40db4d5156fbe4397a85cbc5396f201475a4648500868851085b4b9e1b87303788d4eb81961cff7527fb7d1b4b89e1a02b3742eba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docformatter \
python310-docformatter \
python3dist-docformatter"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
python310-untokenize \
update-alternatives"

inherit rpm
