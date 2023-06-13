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

RPM_NAME = "python311-azure-ai-formrecognizer-3.2.1-1.2.noarch.rpm"
RPM_HASH = "4ad44addae976c58c0bc35047d3fbee01be4bc2938fa580b7c670d3a244e4860a16f6dae1b5cc6008d3411064cebd6ee7173055d3e742b3c9219ca49193c9783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-formrecognizer) \
python311-azure-ai-formrecognizer \
python3dist(azure-ai-formrecognizer)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-ai-nspkg \
python311-azure-common \
python311-azure-core \
python311-msrest \
python311-typing_extensions"

inherit rpm
