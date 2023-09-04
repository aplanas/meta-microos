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

RPM_NAME = "python39-azure-ai-language-conversations-1.1.0-1.1.noarch.rpm"
RPM_HASH = "c6ebde1a4b5271bfd5edfc85bc0af927f6b4b11e8b080e7c242f3f73088b20e1baf771ccd7e3e2dac69c79ba0131c279fa32a9e789587d084c7022f9303f09c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-language-conversations \
python39-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "-python39-azure-common >= 1.1 with python39-azure-common < 2.0.0 \
-python39-azure-core >= 1.24.0 with python39-azure-core < 2.0.0 \
-python39-isodate >= 0.6.1 with python39-isodate < 1.0.0 \
python-abi \
python39-azure-ai-language-nspkg \
python39-azure-ai-nspkg \
python39-six"

inherit rpm
