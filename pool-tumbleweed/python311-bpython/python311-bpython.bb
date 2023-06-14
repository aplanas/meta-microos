SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python311-bpython-0.24-2.1.noarch.rpm"
RPM_HASH = "57393c9c89b52579554c2b274eaadf54d121a5df1672b16562db3e89e1721c82898a78746ecf2de825c2d7dd0bb751c9ad74855a9e99759b3394403962c689d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bpython \
python311-bpython \
python3dist-bpython"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-bpython-common \
python311-curtsies \
python311-greenlet \
python311-pygments \
python311-pyxdg \
python311-requests \
update-alternatives"

inherit rpm
