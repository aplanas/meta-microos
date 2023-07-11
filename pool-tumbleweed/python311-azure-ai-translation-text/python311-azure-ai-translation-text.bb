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

RPM_NAME = "python311-azure-ai-translation-text-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "9570687678d30927553da7cbc6e52d1953aec47526bcdefcfb5270393acb9fe23932f16d9f7fd6274bb6b02ce111c5b56eceda5a7c9e52d11fad08eeb22fe289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-text \
python3.11dist-azure-ai-translation-text \
python311-azure-ai-translation-text \
python3dist-azure-ai-translation-text"

RDEPENDS:${PN} += "python-abi \
python311-azure-ai-nspkg \
python311-azure-ai-translation-nspkg \
python311-azure-common \
python311-azure-core \
python311-msrest"

inherit rpm
