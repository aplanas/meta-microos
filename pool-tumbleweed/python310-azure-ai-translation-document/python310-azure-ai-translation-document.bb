SUMMARY = "Microsoft Azure Document Translation Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Document Translation is a cloud service that translates documents \
to and from 90 languages and dialects while preserving document structure and data format. \
Use the client library for Document Translation to: \
 \
 * Translate numerous, large files from an Azure Blob Storage container to a target container \
   in your language of choice. \
 * Check the translation status and progress of each document in the translation operation. \
 * Apply a custom translation model or glossaries to tailor translation to your specific case."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-ai-translation-document-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "bc2b04c6cce4b46bc5f8e6f0592f8e18d79b01b9534613aaa2199c50cc67616a3f6120a199273bc8c032091452a63b8cf5a03a6794c85c25efc10ebb4670c4fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-translation-document \
python310-azure-ai-translation-document \
python3dist-azure-ai-translation-document"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-ai-translation-nspkg \
python310-azure-core \
python310-msrest"

inherit rpm
