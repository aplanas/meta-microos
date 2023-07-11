SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-rnginline-1.0.0-1.3.noarch.rpm"
RPM_HASH = "f25c872a9e6bc1f2eaa793dade5957a3d9c520693a822e53e51b0e7dafef3b341b16535e1383520c525ba9dd5664f7c00675668dd123e1885d2e467fe6b3d081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rnginline \
python3.11dist-rnginline \
python311-rnginline \
python3dist-rnginline"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docopt \
python311-importlib-resources \
python311-lxml \
python311-typing-extensions \
update-alternatives"

inherit rpm
