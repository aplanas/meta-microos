SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "python39-sphinxcontrib-serializinghtml-1.1.5-2.1.noarch.rpm"
RPM_HASH = "fdae6eeeefa99306703709fb3d3da14663b0bf910a4706c61ed6c44a6ceb49331bdf2059e2f110a27d6097095abc835d5c5ea05e23820a9a58411d42e85e3699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-serializinghtml) \
python39-sphinxcontrib-serializinghtml \
python3dist(sphinxcontrib-serializinghtml)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
