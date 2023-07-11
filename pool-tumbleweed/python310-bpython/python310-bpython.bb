SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python310-bpython-0.24-2.3.noarch.rpm"
RPM_HASH = "83de2a6ebeec7449e8ddd62caedd66e3aa8ad76a799df4194bbb4e79f461cb70bd8f9303e7ebe78697d5beaa211afe42b12aff6b57f48f304e2e01bbe8486edc"
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
