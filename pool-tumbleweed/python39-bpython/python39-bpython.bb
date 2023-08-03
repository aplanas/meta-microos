SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python39-bpython-0.24-3.1.noarch.rpm"
RPM_HASH = "5775e70115eb7b675f366f41094d3b0155b774fd3fff9ebb8a582fba3337fddab1d3df008a3ace2b1fac364de734df9ed7f9c8530b0039f54893591c56643226"
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
