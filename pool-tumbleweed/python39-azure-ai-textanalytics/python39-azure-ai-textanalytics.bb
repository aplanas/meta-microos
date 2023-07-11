SUMMARY = "Azure Text Analytics client library for Python"
DESCRIPTION = "Text Analytics is a cloud-based service that provides advanced natural language \
processing over raw text, and includes six main functions: \
 \
* Sentiment Analysis \
* Named Entity Recognition \
* Personally Identifiable Information (PII) Entity Recognition \
* Linked Entity Recognition \
* Language Detection \
* Key Phrase Extraction"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python39-azure-ai-textanalytics-5.3.0-1.1.noarch.rpm"
RPM_HASH = "750752f9ccac2cc9285c2575e7c32889a06472e138c2605baf894da5809a3295112e31992c0aa19dd5dbbce461967c501c7437607cb9bd268e8bc3216c992b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-textanalytics \
python39-azure-ai-textanalytics \
python3dist-azure-ai-textanalytics"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-nspkg \
python39-azure-common \
python39-azure-core \
python39-isodate \
python39-typing-extensions"

inherit rpm
