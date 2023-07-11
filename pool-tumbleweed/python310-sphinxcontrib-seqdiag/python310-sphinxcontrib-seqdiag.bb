SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python310-sphinxcontrib-seqdiag-3.0.0-1.8.noarch.rpm"
RPM_HASH = "b116e4cd9dc042253be9bba80fefe42dd374d063258e012520fdd5d85835216ef4e65cf3e9a910b0766c7f9148107f719ce15f79fc610ddb0ec78eb284360347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-seqdiag \
python310-sphinxcontrib-seqdiag \
python3dist-sphinxcontrib-seqdiag"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-blockdiag \
python310-seqdiag"

inherit rpm
