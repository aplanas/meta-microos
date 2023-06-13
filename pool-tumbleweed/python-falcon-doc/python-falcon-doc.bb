SUMMARY = "Documentation files for python-falcon"
DESCRIPTION = "HTML documentation including API documentation and changelog for python-falcon."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python-falcon-doc-3.1.1-1.4.noarch.rpm"
RPM_HASH = "6e17b1c4e6686e5c9448a124a1ff62c1ccea3758916d1f17c63c7a8723798515ce148cc2e13c75420221135727db4c53c88ab5dc22498082b9c963168a64e2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-falcon-doc \
python310-falcon-doc \
python311-falcon-doc \
python39-falcon-doc"

RDEPENDS:${PN} += ""

inherit rpm
