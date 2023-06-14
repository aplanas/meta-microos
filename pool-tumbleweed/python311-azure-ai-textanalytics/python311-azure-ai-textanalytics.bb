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

PV = "5.2.1"

RPM_NAME = "python311-azure-ai-textanalytics-5.2.1-1.3.noarch.rpm"
RPM_HASH = "e6d033573eb03dee7b78067cf6194f608f557bdad7696c64cfc3678c14cba2e1acc64baf4f4695f1f7407e10c41098e1ace7ac2437254ee30c59b0093605fad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-ai-textanalytics \
python311-azure-ai-textanalytics \
python3dist-azure-ai-textanalytics"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-msrest \
python311-typing-extensions"

inherit rpm
