SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python39-sphinxcontrib-devhelp-1.0.2-2.2.noarch.rpm"
RPM_HASH = "559d7d19faef04bbced0d8bf8c6540280c64953c3793bf2f75774d7e2ead6db619da14cfdc9c8ced4af37e34254ff8cc50b936c0c92b3a3b3c691d1579e2c5ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-devhelp \
python39-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
