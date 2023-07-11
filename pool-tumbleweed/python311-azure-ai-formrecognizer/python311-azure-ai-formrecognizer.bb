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

PV = "3.2.1"

RPM_NAME = "python311-azure-ai-formrecognizer-3.2.1-1.3.noarch.rpm"
RPM_HASH = "ff196f38b5c82b4c92bbfc694984fbc142635d14d5269bea9390e3cb374b27e26fd170972fd03553341a16467319dcfa3369d2bf5a71dbd0b240e0dedb86d6ad"
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
