SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python39-sphinxcontrib-seqdiag-3.0.0-1.6.noarch.rpm"
RPM_HASH = "0c2927ab18a7d8d27f4fcc8fe61af7efbd21ce0bc32046944a5dbf09b0c25a543bcf4ee971fe9edf6d9795dd833f462120260796bf10837dbf3c1cbaecce7a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-seqdiag) \
python39-sphinxcontrib-seqdiag \
python3dist(sphinxcontrib-seqdiag)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-blockdiag \
python39-seqdiag"

inherit rpm
