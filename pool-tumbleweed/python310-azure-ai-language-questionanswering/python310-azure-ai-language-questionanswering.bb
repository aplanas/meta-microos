SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-ai-language-questionanswering-1.1.0-1.4.noarch.rpm"
RPM_HASH = "fa280ad354d11c0bf500909665b62576c1ca24890e9a909cdc82f3b25cd87f016c8f927531e68567e9f7b2598c9735085757ceb090a421a08a6d3288d91b0fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-language-questionanswering \
python310-azure-ai-language-questionanswering \
python3dist-azure-ai-language-questionanswering"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-language-nspkg \
python310-azure-ai-nspkg \
python310-azure-core \
python310-isodate"

inherit rpm
