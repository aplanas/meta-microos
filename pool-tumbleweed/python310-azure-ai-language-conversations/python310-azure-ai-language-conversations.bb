SUMMARY = "Microsoft Azure Conversational Language Understanding Client Library for Python"
DESCRIPTION = "Conversational Language Understanding, aka CLU for short, is a cloud-based conversational \
AI service which is mainly used in bots to extract useful information from user utterance \
(natural language processing). The CLU analyze api encompasses two projects; conversation, \
and orchestration projects. You can use the 'conversation' project if you want to extract \
intents (intention behind a user utterance) and custom entities. You can also use the \
'orchestration' project which orchestrates multiple language apps to get the best response \
(language apps like Question Answering, Luis, and Conversation)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-ai-language-conversations-1.1.0-1.1.noarch.rpm"
RPM_HASH = "6215d747e1b24d4aed8c68f73fca72c197ffd42588c9badde4fd5a1112fb3a32f4a696b1b72a878a1fec21c62e3dd72a3e5e4077c6d7058e4e920ad76317cb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-language-conversations \
python310-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "-python310-azure-common >= 1.1 with python310-azure-common < 2.0.0 \
-python310-azure-core >= 1.24.0 with python310-azure-core < 2.0.0 \
-python310-isodate >= 0.6.1 with python310-isodate < 1.0.0 \
python-abi \
python310-azure-ai-language-nspkg \
python310-azure-ai-nspkg \
python310-six"

inherit rpm
