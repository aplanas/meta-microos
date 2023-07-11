SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python39-sphinxcontrib-seqdiag-3.0.0-1.8.noarch.rpm"
RPM_HASH = "731460f54cc664ec55342f31f9dade5b87167c482792ff581f9833751bc5b52e12ba887d35913e85960251628d1cf9669e5b79b98afc195db0737e1cc7d44d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-seqdiag \
python39-sphinxcontrib-seqdiag \
python3dist-sphinxcontrib-seqdiag"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-blockdiag \
python39-seqdiag"

inherit rpm
