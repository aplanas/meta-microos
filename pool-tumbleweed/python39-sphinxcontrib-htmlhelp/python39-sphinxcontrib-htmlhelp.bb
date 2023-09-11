SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.4"

RPM_NAME = "python39-sphinxcontrib-htmlhelp-2.0.4-1.1.noarch.rpm"
RPM_HASH = "bc3b31939b3d46160cbcca512d3f93fdb56928a72b313eda8b3370abe5f8631d7d3390d610594f336805e370ac77872b77c72d33ece911989e6f1d2b103fb052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-htmlhelp \
python39-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
