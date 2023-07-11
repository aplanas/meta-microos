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

RPM_NAME = "python310-azure-ai-translation-text-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "e6876b4844e05e7b978413fa7fc596336a050472ca5da58aa0018200b0432e3760e0b6bdcf687a4122e0b40bd88d5d8f28820fd2310e8977b13f024e48099b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-ai-translation-text \
python310-azure-ai-translation-text \
python3dist-azure-ai-translation-text"

RDEPENDS:${PN} += "python-abi \
python310-azure-ai-nspkg \
python310-azure-ai-translation-nspkg \
python310-azure-common \
python310-azure-core \
python310-msrest"

inherit rpm
