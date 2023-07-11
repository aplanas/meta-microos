SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.26.1"

RPM_NAME = "python39-mycli-1.26.1-2.7.noarch.rpm"
RPM_HASH = "600fd996d56b1d2512bb250a0aecdc5d075c3edc833133c7725ee84cd022d051a0ad02b87f376b8ab80c283ae87c9cf530a8c1d66579c2051c6768a702c5650e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mycli \
python39-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyMySQL \
python39-Pygments \
python39-cli-helpers \
python39-click \
python39-configobj \
python39-cryptography \
python39-prompt-toolkit \
python39-pyaes \
python39-pyperclip \
python39-sqlglot \
python39-sqlparse \
update-alternatives"

inherit rpm
