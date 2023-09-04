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

RPM_NAME = "python39-azure-ai-formrecognizer-3.3.0-1.1.noarch.rpm"
RPM_HASH = "8363d0a79ed4b929873dfdba0b77c2153a6848bbf994326f6686d3c0cd7cea150cd1e165c2af3ceb8e42546a51a96b6f8c79819289306afb6326cef3e87bee94"
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
