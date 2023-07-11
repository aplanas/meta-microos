SUMMARY = "Microsoft Azure Question Answering Client Library for Python"
DESCRIPTION = "Question Answering is a cloud-based API service that lets you create a conversational \
question-and-answer layer over your existing data. Use it to build a knowledge base \
by extracting questions and answers from your semi-structured content, including FAQ, \
manuals, and documents. Answer users’ questions with the best answers from the QnAs \
in your knowledge base—automatically. Your knowledge base gets smarter, too, as it \
continually learns from users' behavior."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-ai-language-questionanswering-1.1.0-1.4.noarch.rpm"
RPM_HASH = "44029291ccc2733719654e1bf3eef977e769252710a318b02328b0966ee6956cf7243b882d55a2732af6fb5f06453f512ad0efe67a8b3104fcdc5fef4aa17798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-language-questionanswering \
python39-azure-ai-language-questionanswering \
python3dist-azure-ai-language-questionanswering"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-language-nspkg \
python39-azure-ai-nspkg \
python39-azure-core \
python39-isodate"

inherit rpm
