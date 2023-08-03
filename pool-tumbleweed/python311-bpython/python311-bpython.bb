SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python311-bpython-0.24-3.1.noarch.rpm"
RPM_HASH = "dec0a1260af20605a09193280f69413f0ce52835a084f89be5602d16d7482d8910f0be76abba014a7a405bd6857333a0bbaf9e6b45f20645df2751ec6be5c34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bpython \
python3.11dist-bpython \
python311-bpython \
python3dist-bpython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-bpython-common \
python311-curtsies \
python311-greenlet \
python311-pygments \
python311-pyxdg \
python311-requests \
update-alternatives"

inherit rpm
