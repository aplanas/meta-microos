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

RPM_NAME = "python310-azure-ai-formrecognizer-3.2.1-1.3.noarch.rpm"
RPM_HASH = "594b2c4dc5c409932bd647731ef2d04dfc091a300e0f798be8808de5ac675bd1d6b7aff3877afb49e846ea1393d585e21906f3111bab7e619a6c1516e0788cdb"
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
