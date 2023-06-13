SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "0.0.2"

RPM_NAME = "python311-rnginline-0.0.2-4.9.noarch.rpm"
RPM_HASH = "4640eae9639596f301732485db88e6a28bdccfcace25c2f05dd25b2a1ed1e2cd314c6b81edd18f0533b129c3c3e908be76561e41490d739412d063dcc1395917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rnginline) \
python311-rnginline \
python3dist(rnginline)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-docopt \
python311-lxml \
python311-six \
update-alternatives"

inherit rpm
