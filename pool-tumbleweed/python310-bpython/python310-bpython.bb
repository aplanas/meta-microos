SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python310-bpython-0.24-3.1.noarch.rpm"
RPM_HASH = "fd69bff47e6836c265c1cae6f62bc1d4ea11e12798be16c7f80a76fca0d3ead3dc5004419f440dbcc9ed1e0e7d9489fe30f13be1ed87e92b726270cb977f22de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bpython \
python310-bpython \
python3dist-bpython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-bpython-common \
python310-curtsies \
python310-greenlet \
python310-pygments \
python310-pyxdg \
python310-requests \
update-alternatives"

inherit rpm
