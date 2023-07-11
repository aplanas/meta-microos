SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-ai-language-questionanswering-1.1.0-1.4.noarch.rpm"
RPM_HASH = "ef0ce582c1471aa7df77c848d00cd922fae46d2e0097f91dd0ea2a3b7e7574689ca1d920d9c6c6b0e9565eb36f89a74703ea41f1b702e4f65d6c8052f735db07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-questionanswering \
python3.11dist-azure-ai-language-questionanswering \
python311-azure-ai-language-questionanswering \
python3dist-azure-ai-language-questionanswering"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-language-nspkg \
python311-azure-ai-nspkg \
python311-azure-core \
python311-isodate"

inherit rpm
