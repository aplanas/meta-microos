SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python311-sphinxcontrib-seqdiag-3.0.0-1.8.noarch.rpm"
RPM_HASH = "c9d60a636d22bdcf6cd01dea56e81e0534d5cc6acb36e12ce7f034c18a86bab597d03ef666284ca7ce43ec5acca1d8e441e51f2be879445b08cf2147b8c94600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-seqdiag \
python3.11dist-sphinxcontrib-seqdiag \
python311-sphinxcontrib-seqdiag \
python3dist-sphinxcontrib-seqdiag"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-blockdiag \
python311-seqdiag"

inherit rpm
