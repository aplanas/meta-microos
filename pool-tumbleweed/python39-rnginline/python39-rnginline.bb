SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-rnginline-1.0.0-1.3.noarch.rpm"
RPM_HASH = "6d3d3121d39131df745eb23be7940e005d01f8c316a73ac58bcad139122441348d2562adccb291fb0f2b5b18fcfa5a393aac7b944856045d44bd27614bb4fdcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rnginline \
python39-rnginline \
python3dist-rnginline"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docopt \
python39-importlib-resources \
python39-lxml \
python39-typing-extensions \
update-alternatives"

inherit rpm
