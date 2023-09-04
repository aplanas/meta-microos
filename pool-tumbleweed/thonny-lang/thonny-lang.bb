SUMMARY = "Translations for Thonny IDE"
DESCRIPTION = "Provides translations for Thonny IDE"
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "thonny-lang-4.1.1-1.1.noarch.rpm"
RPM_HASH = "3be57d064cda53dace6c938a1188cd5d5fcbd72fbd901b6b28eccd2e9943092e23cbe7a7b0b72282f8a3616f4c9a6fa453d4afc5f9abb9efd9110fff524e96a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thonny-ar-AR \
locale-thonny-cs-CZ \
locale-thonny-de-DE \
locale-thonny-el-GR \
locale-thonny-en-GB \
locale-thonny-en-US \
locale-thonny-es-ES \
locale-thonny-et-EE \
locale-thonny-fa-IR \
locale-thonny-fi-FI \
locale-thonny-fr-FR \
locale-thonny-hu-HU \
locale-thonny-hy-AM \
locale-thonny-it-IT \
locale-thonny-ja-JP \
locale-thonny-ko-KR \
locale-thonny-lt-LT \
locale-thonny-nb-NO \
locale-thonny-nl-NL \
locale-thonny-nn-NO \
locale-thonny-pl-PL \
locale-thonny-pt-BR \
locale-thonny-pt-PT \
locale-thonny-ro-RO \
locale-thonny-ru-RU \
locale-thonny-sk-SK \
locale-thonny-sl-SI \
locale-thonny-sq-AL \
locale-thonny-sv-SE \
locale-thonny-ta-IN \
locale-thonny-th-TH \
locale-thonny-tr-TR \
locale-thonny-uk-UA \
locale-thonny-vi-VN \
locale-thonny-zh-CN \
locale-thonny-zh-TW \
thonny-lang"

RDEPENDS:${PN} += "python-abi \
thonny"

inherit rpm
