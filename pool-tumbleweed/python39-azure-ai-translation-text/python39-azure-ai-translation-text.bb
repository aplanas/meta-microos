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

RPM_NAME = "python39-azure-ai-translation-text-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "c7fa31818d532c05df0e8e9d7674239973662897656c3f2b0a0d35a07fdc368e55e4aef6592ec17b48c8a33fdf99f40f38cfce62c2b8fb15cd27929759edebab"
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
