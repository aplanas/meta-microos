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

RPM_NAME = "python310-azure-ai-translation-text-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "d2171005812dc927eadbfdb19146cfaa60483f0a98c1ea025e73782718656676330ca558b77ecb2085604ab7890a15e7463adf34906ed1f7287f0bd369a8ca14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-text \
python3.10dist-azure-ai-translation-text \
python310-azure-ai-translation-text \
python3dist-azure-ai-translation-text"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-ai-translation-nspkg \
python310-azure-common \
python310-azure-core \
python310-msrest"

inherit rpm
