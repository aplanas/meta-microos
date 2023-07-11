SUMMARY = "Microsoft Azure Conversational Language Understanding Client Library for Python"
DESCRIPTION = "Conversational Language Understanding, aka CLU for short, is a cloud-based conversational \
AI service which is mainly used in bots to extract useful information from user utterance \
(natural language processing). The CLU analyze api encompasses two projects; conversation, \
and orchestration projects. You can use the 'conversation' project if you want to extract \
intents (intention behind a user utterance) and custom entities. You can also use the \
'orchestration' project which orchestrates multiple language apps to get the best response \
(language apps like Question Answering, Luis, and Conversation)."
LICENSE = "MIT"

PV = "1.1.0b1"

RPM_NAME = "python310-azure-ai-language-conversations-1.1.0b1-1.6.noarch.rpm"
RPM_HASH = "0cad07abd70015bc196619bc5d40629c68eb3d1d978b78b550320d4f1a7b2eef5683c04fcee4be017f2e34b131431ff6e34d86125307e6d80d0019f3a2825572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-language-conversations \
python310-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-language-nspkg \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-msrest \
python310-six"

inherit rpm
