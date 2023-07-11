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

RPM_NAME = "python39-docformatter-1.4-1.11.noarch.rpm"
RPM_HASH = "2ff21740fd2ce45aa73d27307aa6bffd8dbe323f0e71fa574ba518c01daec81cb5edfad41fa09458d0462223bd1c63b343c90dc41f62df52536c862368e4c4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docformatter \
python39-docformatter \
python3dist-docformatter"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
python39-untokenize \
update-alternatives"

inherit rpm
