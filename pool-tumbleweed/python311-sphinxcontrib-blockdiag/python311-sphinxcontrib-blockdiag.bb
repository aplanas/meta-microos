SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python311-sphinxcontrib-blockdiag-3.0.0-3.5.noarch.rpm"
RPM_HASH = "4aa0e9ac5ae3d2c85b2f8eba52eed24170e99db8ba87f0ef6d13b8b4ef24e16871adfca1556eafc003186384fa9bceca3e623aa52de3b3bf27cbc4cfeb76694c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-blockdiag \
python3.11dist-sphinxcontrib-blockdiag \
python311-sphinxcontrib-blockdiag \
python3dist-sphinxcontrib-blockdiag"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-blockdiag"

inherit rpm
