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

RPM_NAME = "python310-azure-ai-formrecognizer-3.3.0-1.1.noarch.rpm"
RPM_HASH = "64243d5ebc018127e6ce07299ea88995306e69fa898b3e11b0fe0e4db52be71241464ee5612d1b39bcd4ee7fffdedb376f0102b58fddbfe14d81f94b4f3b92dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-formrecognizer \
python310-azure-ai-formrecognizer \
python3dist-azure-ai-formrecognizer"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-msrest \
python310-typing-extensions"

inherit rpm
