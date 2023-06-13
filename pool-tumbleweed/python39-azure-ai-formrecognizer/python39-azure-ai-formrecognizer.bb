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

RPM_NAME = "python39-azure-ai-formrecognizer-3.2.1-1.2.noarch.rpm"
RPM_HASH = "b9a6e3b4f613a89a5bc2eb992d4764ee59013bc9571e2213d55023628fd627cd65a71c9f25be8d13edd6ae870a8c254cc15ca0b4a15baed025d61726e47ef338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-formrecognizer) \
python39-azure-ai-formrecognizer \
python3dist(azure-ai-formrecognizer)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-ai-nspkg \
python39-azure-common \
python39-azure-core \
python39-msrest \
python39-typing_extensions"

inherit rpm
