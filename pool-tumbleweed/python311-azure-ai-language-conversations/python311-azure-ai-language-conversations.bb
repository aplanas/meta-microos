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

RPM_NAME = "python311-azure-ai-language-conversations-1.1.0-1.1.noarch.rpm"
RPM_HASH = "fa74b41e5fc4144d22b6ea1ce97d8ec5455c3c1121206718036a96da7de4494e6a0ed73ca20a55228613f62fa4cb9a8659c50e0a9215c520264ca0965632aedb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-conversations \
python3.11dist-azure-ai-language-conversations \
python311-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "-python311-azure-common >= 1.1 with python311-azure-common < 2.0.0 \
-python311-azure-core >= 1.24.0 with python311-azure-core < 2.0.0 \
-python311-isodate >= 0.6.1 with python311-isodate < 1.0.0 \
python-abi \
python311-azure-ai-language-nspkg \
python311-azure-ai-nspkg \
python311-six"

inherit rpm
