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

RPM_NAME = "python39-azure-ai-translation-document-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "5cbb708a134dfbc5d35fde87328d59ea47b92d0c7beaedbfa62a0fdfe9285a95ce969005bd3c2d7ab29775958bd7b394bbace52a50c90825fd302636d90675ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-translation-document \
python39-azure-ai-translation-document \
python3dist-azure-ai-translation-document"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-nspkg \
python39-azure-ai-translation-nspkg \
python39-azure-core \
python39-msrest"

inherit rpm
