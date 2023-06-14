SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "python39-sphinxcontrib-qthelp-1.0.3-3.1.noarch.rpm"
RPM_HASH = "218ba6ef3e0cd5e72061f49660347a89d615ffd95951935be06bc2c8a681b452418694b56ae85385f5e7ecbfdf5014b48c72f623fcc9ffeac9111b7d59d03c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-qthelp \
python39-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
