SUMMARY = "Translations for package webkit2gtk3-soup2"
DESCRIPTION = "Provides translations for the 'webkit2gtk3-soup2' package."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "WebKitGTK-4.0-lang-2.40.5-3.1.noarch.rpm"
RPM_HASH = "3bff7dbb0c406d84154a3a8749be9a410a646bfc9e18bd50674568d8c9e9380bb6824c8506f4119ac85a08d132b517490c84d5ab37fd062592976e9bd15e417b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WebKitGTK-4.0-lang \
WebKitGTK-4.0-lang-all \
locale-WebKitGTK-4.0-ar \
locale-WebKitGTK-4.0-as \
locale-WebKitGTK-4.0-bg \
locale-WebKitGTK-4.0-ca \
locale-WebKitGTK-4.0-cs \
locale-WebKitGTK-4.0-da \
locale-WebKitGTK-4.0-de \
locale-WebKitGTK-4.0-el \
locale-WebKitGTK-4.0-en-CA \
locale-WebKitGTK-4.0-en-GB \
locale-WebKitGTK-4.0-eo \
locale-WebKitGTK-4.0-es \
locale-WebKitGTK-4.0-et \
locale-WebKitGTK-4.0-eu \
locale-WebKitGTK-4.0-fi \
locale-WebKitGTK-4.0-fr \
locale-WebKitGTK-4.0-gl \
locale-WebKitGTK-4.0-gu \
locale-WebKitGTK-4.0-he \
locale-WebKitGTK-4.0-hi \
locale-WebKitGTK-4.0-hr \
locale-WebKitGTK-4.0-hu \
locale-WebKitGTK-4.0-id \
locale-WebKitGTK-4.0-it \
locale-WebKitGTK-4.0-ja \
locale-WebKitGTK-4.0-ka \
locale-WebKitGTK-4.0-kn \
locale-WebKitGTK-4.0-ko \
locale-WebKitGTK-4.0-lt \
locale-WebKitGTK-4.0-lv \
locale-WebKitGTK-4.0-ml \
locale-WebKitGTK-4.0-mr \
locale-WebKitGTK-4.0-nb \
locale-WebKitGTK-4.0-nl \
locale-WebKitGTK-4.0-or \
locale-WebKitGTK-4.0-pa \
locale-WebKitGTK-4.0-pl \
locale-WebKitGTK-4.0-pt \
locale-WebKitGTK-4.0-pt-BR \
locale-WebKitGTK-4.0-ro \
locale-WebKitGTK-4.0-ru \
locale-WebKitGTK-4.0-sl \
locale-WebKitGTK-4.0-sr \
locale-WebKitGTK-4.0-sr@latin \
locale-WebKitGTK-4.0-sv \
locale-WebKitGTK-4.0-ta \
locale-WebKitGTK-4.0-te \
locale-WebKitGTK-4.0-tr \
locale-WebKitGTK-4.0-uk \
locale-WebKitGTK-4.0-vi \
locale-WebKitGTK-4.0-zh-CN"

RDEPENDS:${PN} += "WebKitGTK-4.0"

inherit rpm
