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

RPM_NAME = "python310-azure-ai-textanalytics-5.2.1-1.3.noarch.rpm"
RPM_HASH = "219fc4d53543673c4cf18bcd6b67b0e1faa145bc5f4c319fbf2a8402cf493804e809a7f6878b3381249daf7a16c2ba554f310a50f7737332a14a690857eb833d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-textanalytics \
python3.10dist(azure-ai-textanalytics) \
python310-azure-ai-textanalytics \
python3dist(azure-ai-textanalytics)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-msrest \
python310-typing_extensions"

inherit rpm
