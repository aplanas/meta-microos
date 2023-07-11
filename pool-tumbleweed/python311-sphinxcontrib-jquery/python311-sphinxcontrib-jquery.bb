SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python311-sphinxcontrib-jquery-4.1-1.3.noarch.rpm"
RPM_HASH = "86d3c60ed0348aac52adc89ef75538bbfd822fa13fc83ed12185dd453272bf194d181488bde91952012df2b6147d640b9fc0070157b08d5206d4c069553d0811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jquery \
python3.11dist-sphinxcontrib-jquery \
python311-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
