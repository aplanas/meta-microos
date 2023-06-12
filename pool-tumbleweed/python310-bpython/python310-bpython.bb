SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python310-bpython-0.24-2.1.noarch.rpm"
RPM_HASH = "dd481f83134d50091b56368a88e9e606dac2f7ac46966ce241163a8b2f11b93887987b35f08f04ca93a61d98ae26b24f2d015ce563b2b852d841b57fd595eb41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.bpython-interpreter.bpython-3.10.desktop) \
metainfo() \
metainfo(org.bpython-interpreter.bpython-3.10.metainfo.xml) \
python3-bpython \
python3.10dist(bpython) \
python310-bpython \
python3dist(bpython)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-bpython-common \
python310-curtsies \
python310-greenlet \
python310-pygments \
python310-pyxdg \
python310-requests \
update-alternatives"

inherit rpm
