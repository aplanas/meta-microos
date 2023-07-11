SUMMARY = "Translations for package help2man"
DESCRIPTION = "Provides translations for the 'help2man' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.49.3"

RPM_NAME = "help2man-lang-1.49.3-1.4.noarch.rpm"
RPM_HASH = "efe3a334608656e0a217746ffc1586228e5b660a97c775aefe446a45c97e88b40f7bc944653ff9cc8550a951791da5342a867f0167970c7ef1e8b869e4b55264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "help2man-lang \
help2man-lang-all \
locale-help2man-da \
locale-help2man-de \
locale-help2man-el \
locale-help2man-eo \
locale-help2man-es \
locale-help2man-fi \
locale-help2man-fr \
locale-help2man-hr \
locale-help2man-hu \
locale-help2man-it \
locale-help2man-ja \
locale-help2man-ko \
locale-help2man-nb \
locale-help2man-pl \
locale-help2man-pt-BR \
locale-help2man-ro \
locale-help2man-ru \
locale-help2man-sr \
locale-help2man-sv \
locale-help2man-ta \
locale-help2man-uk \
locale-help2man-vi \
locale-help2man-zh-CN"

RDEPENDS:${PN} += "help2man"

inherit rpm
