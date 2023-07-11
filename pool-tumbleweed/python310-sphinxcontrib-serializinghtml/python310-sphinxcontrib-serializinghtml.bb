SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "python310-sphinxcontrib-serializinghtml-1.1.5-2.2.noarch.rpm"
RPM_HASH = "7ca5e969d8426d3fea4e6b34d8fe643fe02ac180c728a7c3bdbd4f3805560530fe52e157d69ffd08a64a8ba3b210ff0134a8686aed6591e06e5c9d7a147cc425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-serializinghtml \
python310-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
