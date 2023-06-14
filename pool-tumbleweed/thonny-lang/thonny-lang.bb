SUMMARY = "Translations for Thonny IDE"
DESCRIPTION = "Provides translations for Thonny IDE"
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "thonny-lang-4.0.2-1.3.noarch.rpm"
RPM_HASH = "5940ba6c48b60910d4567203440f86c37c86b7d988e5379814ff56714321ec9ea47fd1dd975ddee9de639de8785c050497b9de0979522672e8f1b5f71b7e56b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thonny-ar-AR \
locale-thonny-cs-CZ \
locale-thonny-de-DE \
locale-thonny-el-GR \
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
