SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python39-bpython-0.24-2.1.noarch.rpm"
RPM_HASH = "78876620fe635538b26f7d0654be29a42b13da3e5270317600be916d67009466a8126ef38db461c7443d14d662f41117df89453c22efafc9e681b7cab989ba12"
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
