SUMMARY = "Azure Text Translation Client Library for Python"
DESCRIPTION = "Text Translation is a cloud-based REST API feature of the Translator service that uses \
neural machine translation technology to enable quick and accurate source-to-target \
text translation in real time across all supported languages. \
 \
Use the Text Translation client library for Python to: \
 \
* Return a list of languages supported by Translate, Transliterate, and Dictionary operations. \
* Render single source-language text to multiple target-language texts with a single request. \
* Convert text of a source language in letters of a different script. \
* Return equivalent words for the source term in the target language. \
* Return grammatical structure and context examples for the source term and target term pair."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-ai-translation-text-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "89e64e49cd147aed19ed80e2ba23cee23280131f71f74e59495f145ad096e59b4f56a351e082cf8fc3341ec78c329542e99932aca398375583443c368f214738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-ai-translation-text \
python39-azure-ai-translation-text \
python3dist-azure-ai-translation-text"

RDEPENDS:${PN} += "python-abi \
python39-azure-ai-nspkg \
python39-azure-ai-translation-nspkg \
python39-azure-common \
python39-azure-core \
python39-msrest"

inherit rpm
