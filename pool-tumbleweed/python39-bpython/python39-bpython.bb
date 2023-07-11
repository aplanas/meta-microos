SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python39-bpython-0.24-2.3.noarch.rpm"
RPM_HASH = "9f82cc211c6ae9ef59b6e83401ecd58d3641c138c4de2485fa604f92922786df60443ed27c8eeb04449939c59c68431a1ebe89168a9a67a95621000ea293c663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bpython \
python39-bpython \
python3dist-bpython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-bpython-common \
python39-curtsies \
python39-greenlet \
python39-pygments \
python39-pyxdg \
python39-requests \
update-alternatives"

inherit rpm
