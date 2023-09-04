SUMMARY = "Microsoft Azure Form Recognizer Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Form Recognizer is a cloud service that uses machine learning \
to recognize text and table data from form documents. It includes the following main \
functionalities: \
 \
 * Custom models - Recognize field values and table data from forms. These models are \
   trained with your own data, so they're tailored to your forms. \
 * Content API - Recognize text and table structures, along with their bounding box coordinates, \
   from documents. Corresponds to the REST service's Layout API. \
 * Prebuilt receipt model - Recognize data from USA sales receipts using a prebuilt model."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-azure-ai-formrecognizer-3.3.0-1.1.noarch.rpm"
RPM_HASH = "95132af28687d41034c8a2646f4c408a0dcfa2db15e137f4bc53deca338aa1c2dd3bb0e36f2f71821d5e60cb144ef19b5aa5bf431363e99dfa1831c6a7f61a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-formrecognizer \
python3.11dist-azure-ai-formrecognizer \
python311-azure-ai-formrecognizer \
python3dist-azure-ai-formrecognizer"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-msrest \
python311-typing-extensions"

inherit rpm
