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

RPM_NAME = "python310-azure-ai-textanalytics-5.3.0-1.1.noarch.rpm"
RPM_HASH = "e39e523506d8ec683066edea0cb1687eaa1f73edfef5314ddaf8aac72ee11e4ac117cadb29757640bac9d958ce2a4a34d5577b50dcbbfd013ed132bc72a41bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-textanalytics \
python310-azure-ai-textanalytics \
python3dist-azure-ai-textanalytics"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-isodate \
python310-typing-extensions"

inherit rpm
