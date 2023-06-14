SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-ai-language-questionanswering-1.1.0-1.3.noarch.rpm"
RPM_HASH = "43a1c0c3c6a301d912e6ee35b3d82e6b8168769ab01c1ca3e2ef9d59874f71da24a79ddca813f465be6c7abfd9b07158553db693922b2c1b85aedda406485413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-questionanswering \
python3.10dist-azure-ai-language-questionanswering \
python310-azure-ai-language-questionanswering \
python3dist-azure-ai-language-questionanswering"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-language-nspkg \
python310-azure-ai-nspkg \
python310-azure-core \
python310-isodate"

inherit rpm
