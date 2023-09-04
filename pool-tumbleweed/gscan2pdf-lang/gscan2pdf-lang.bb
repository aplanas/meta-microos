SUMMARY = "Translations for package gscan2pdf"
DESCRIPTION = "Provides translations for the 'gscan2pdf' package."
LICENSE = "GPL-3.0-only"

PV = "2.13.2"

RPM_NAME = "gscan2pdf-lang-2.13.2-1.3.noarch.rpm"
RPM_HASH = "8f3198ad00b4cc62348af1a7bd8a66c18f6dd2af14076e31a853577afdb1a4244f05bd4eab8e6c774235d29a315423bba2d4575f0637785d2fee4fad88692301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gscan2pdf-lang \
gscan2pdf-lang-all \
locale-gscan2pdf-be \
locale-gscan2pdf-bg \
locale-gscan2pdf-ca \
locale-gscan2pdf-cs \
locale-gscan2pdf-da \
locale-gscan2pdf-de \
locale-gscan2pdf-el \
locale-gscan2pdf-en-GB \
locale-gscan2pdf-es \
locale-gscan2pdf-eu \
locale-gscan2pdf-fa \
locale-gscan2pdf-fi \
locale-gscan2pdf-fr \
locale-gscan2pdf-gl \
locale-gscan2pdf-gu \
locale-gscan2pdf-he \
locale-gscan2pdf-hr \
locale-gscan2pdf-hu \
locale-gscan2pdf-it \
locale-gscan2pdf-ja \
locale-gscan2pdf-ko \
locale-gscan2pdf-nb \
locale-gscan2pdf-nl \
locale-gscan2pdf-oc \
locale-gscan2pdf-pl \
locale-gscan2pdf-pt \
locale-gscan2pdf-pt-BR \
locale-gscan2pdf-ru \
locale-gscan2pdf-sk \
locale-gscan2pdf-sl \
locale-gscan2pdf-sv \
locale-gscan2pdf-tr \
locale-gscan2pdf-uk \
locale-gscan2pdf-zh-CN \
locale-gscan2pdf-zh-TW"

RDEPENDS:${PN} += "gscan2pdf"

inherit rpm
