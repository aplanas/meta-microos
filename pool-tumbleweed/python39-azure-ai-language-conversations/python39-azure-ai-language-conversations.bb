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

RPM_NAME = "python39-azure-ai-language-conversations-1.1.0b1-1.6.noarch.rpm"
RPM_HASH = "590cdfcb01a5fcea94a5c8634845ba703618cadc3422ac1b5ea222e2a55ed4071c1f8feb374e06d05626e7cb2d794687b61a76c248eb0e511d464e071563e31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-language-conversations \
python39-azure-ai-language-conversations \
python3dist-azure-ai-language-conversations"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-language-nspkg \
python39-azure-ai-nspkg \
python39-azure-common \
python39-azure-core \
python39-msrest \
python39-six"

inherit rpm
