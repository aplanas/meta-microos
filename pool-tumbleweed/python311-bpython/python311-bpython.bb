SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python311-bpython-0.24-2.3.noarch.rpm"
RPM_HASH = "1fe850c0b777fcb1fd4d33c39c2f61d1788cf96b8f5b5081d3e2ad4208a4241ed91c4e104887bb4064aab01a326f9a03f8ba62cd77f06c4fa1a2f58de81c2ee0"
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
