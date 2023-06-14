SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "0.0.2"

RPM_NAME = "python310-rnginline-0.0.2-4.9.noarch.rpm"
RPM_HASH = "0405d615852baafe2890dcb05878ccbabd636d693a9709e5ee798a40d3f4a24492dffa7e9a69bc4b48fb2593c19274ebdd2f25bce784925d3e9176c669a54231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rnginline \
python3.10dist-rnginline \
python310-rnginline \
python3dist-rnginline"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-docopt \
python310-lxml \
python310-six \
update-alternatives"

inherit rpm
