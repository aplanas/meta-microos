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

RPM_NAME = "python311-azure-ai-textanalytics-5.3.0-1.1.noarch.rpm"
RPM_HASH = "92f52a1e0f4fed21b4ae1dee585290f25dd17e5bf9f0f2fc719c8ac1a978056306a19220534ad399c788388bcd7b5c7b1c26b91db615389200ec56fff792ae6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-textanalytics \
python3.11dist-azure-ai-textanalytics \
python311-azure-ai-textanalytics \
python3dist-azure-ai-textanalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-isodate \
python311-typing-extensions"

inherit rpm
