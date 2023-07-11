SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python310-sphinxcontrib-jquery-4.1-1.3.noarch.rpm"
RPM_HASH = "7357c9882d7322012b7ada8499d62c92ffea0e8dab31a05a19eeed9b4473043f09cebe829c8d66ae061b98163a8a121421e9cd121daa07219d3f5a937e74a8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-jquery \
python310-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
