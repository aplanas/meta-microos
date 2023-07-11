SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python39-sphinxcontrib-jquery-4.1-1.3.noarch.rpm"
RPM_HASH = "8aec8f28253b7375d8f4a229dc3501e7310b1c55cf57428100234a0c870c39805c51f44107a2c88aa679dda9ca9064e2bb4e3da0a1cd95c72e1fde4e3e1ed973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-jquery \
python39-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
