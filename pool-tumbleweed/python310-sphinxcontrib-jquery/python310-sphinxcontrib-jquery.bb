SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python310-sphinxcontrib-jquery-4.1-2.1.noarch.rpm"
RPM_HASH = "603bea1a4bf6586ef79fb934e843d6cb999632031be7ee40c94dafcd1b7ebdca30f5a4051ac1831a9a58b9a42571f0669ea839b696c24f578a6215fe5f6d01c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-jquery \
python310-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
