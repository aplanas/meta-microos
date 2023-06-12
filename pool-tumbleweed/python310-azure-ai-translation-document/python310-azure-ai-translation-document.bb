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

RPM_NAME = "python310-azure-ai-translation-document-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "07edd170338db69aa95ea7c440b3b686c993f2a11af8855436a9618ea3be122342af15abf5e7e819db65f82f54c4c3e67b05be7a36370e517f8f37434a9fe36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-document \
python3.10dist(azure-ai-translation-document) \
python310-azure-ai-translation-document \
python3dist(azure-ai-translation-document)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-ai-nspkg \
python310-azure-ai-translation-nspkg \
python310-azure-core \
python310-msrest"

inherit rpm
