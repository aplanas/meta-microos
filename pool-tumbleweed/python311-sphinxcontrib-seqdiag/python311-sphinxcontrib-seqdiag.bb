SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python311-sphinxcontrib-seqdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "263af0f4e07c460b032617c714a8f5591902fe65fa26c125d2aa1851eef38c6708a51e7237ba3781878e22f93067e508edba9a59064445415e28d1daea3951f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinxcontrib-seqdiag \
python311-sphinxcontrib-seqdiag \
python3dist-sphinxcontrib-seqdiag"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-blockdiag \
python311-seqdiag"

inherit rpm
