SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-ai-language-questionanswering-1.1.0-1.3.noarch.rpm"
RPM_HASH = "553224f4fc281f02d4920587f1bf0a93837a1fa4d4fc9199ee1d2dc78278307e60ee394fc2c537feeb5fed9abd3d3a15c4a8f33c1e695051026797362f0c9f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-language-questionanswering) \
python39-azure-ai-language-questionanswering \
python3dist(azure-ai-language-questionanswering)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-ai-language-nspkg \
python39-azure-ai-nspkg \
python39-azure-core \
python39-isodate"

inherit rpm
