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

RPM_NAME = "python311-azure-ai-translation-document-1.0.0.0-1.6.noarch.rpm"
RPM_HASH = "936ec1d21c09294cf8609f15b8446bfbf4eca8cfd8a601030457947b402ac146c44e78fc9740516a9c15afe1d90b2c8356ae7482b1bd91fe7953b98cb39787a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-document \
python3.11dist-azure-ai-translation-document \
python311-azure-ai-translation-document \
python3dist-azure-ai-translation-document"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-ai-translation-nspkg \
python311-azure-core \
python311-msrest"

inherit rpm
