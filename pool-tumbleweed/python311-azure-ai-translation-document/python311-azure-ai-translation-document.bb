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

RPM_NAME = "python311-azure-ai-translation-document-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "a8751ce56e340339666baa311927556b56c4d63d17cce18eca877be15916cffc26eb61f10d63447ea64bb930f2ff057aab0cd4d68603d9506dc82f617222ad53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-translation-document) \
python311-azure-ai-translation-document \
python3dist(azure-ai-translation-document)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-ai-nspkg \
python311-azure-ai-translation-nspkg \
python311-azure-core \
python311-msrest"

inherit rpm
