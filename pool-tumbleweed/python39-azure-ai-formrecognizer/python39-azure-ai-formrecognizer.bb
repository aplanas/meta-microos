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

RPM_NAME = "python39-azure-ai-formrecognizer-3.2.1-1.3.noarch.rpm"
RPM_HASH = "63f3ce9b760588424171cb16fc10ff2239bf7282e45e2896e4d252be365f011b64b6ca9e4a0fbcef42f6e6fb15ce7d55221efbcd1d5adb6729c24d32b877f1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-formrecognizer \
python39-azure-ai-formrecognizer \
python3dist-azure-ai-formrecognizer"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-nspkg \
python39-azure-common \
python39-azure-core \
python39-msrest \
python39-typing-extensions"

inherit rpm
