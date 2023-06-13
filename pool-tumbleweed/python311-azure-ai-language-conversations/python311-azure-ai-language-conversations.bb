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

RPM_NAME = "python311-azure-ai-language-conversations-1.1.0b1-1.5.noarch.rpm"
RPM_HASH = "ac7fbbc361c0baf8bfc92bd96dc6d6fa839eb22a2a2ca7a599c849130ef686c2e8b0bc7e473e7cb493a87a235e925356f92b63dc28fd11eb729d301be3e99a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-language-conversations) \
python311-azure-ai-language-conversations \
python3dist(azure-ai-language-conversations)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-ai-language-nspkg \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-msrest \
python311-six"

inherit rpm
