SUMMARY = "Sphinx extension which outputs serialized HTML files"
DESCRIPTION = "sphinxcontrib-serializinghtml is a sphinx extension which outputs \
'serialized' HTML files (json and pickle)."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "python310-sphinxcontrib-serializinghtml-1.1.5-2.1.noarch.rpm"
RPM_HASH = "d72930b2615123f8e94fdd3266c9fd202152bb96f6f6d86ee3b1b9f24c07027e04dc7e7bf85890285d30247797380520909e1b77b29a895abacde94ba837cf83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-serializinghtml \
python3.10dist-sphinxcontrib-serializinghtml \
python310-sphinxcontrib-serializinghtml \
python3dist-sphinxcontrib-serializinghtml"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
