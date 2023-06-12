SUMMARY = "Qt 6 Translations"
DESCRIPTION = "Translations for Qt6 libraries and tools."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-translations-6.5.1-1.1.noarch.rpm"
RPM_HASH = "73d31be3e79ff523d2203e5ef15111cbdee65ba723ef4d77a59b53d52b198734f5404f3dac4377edcdbc3b555a2ea4d60ade3bca39dd7bacc037ea5ed603dfa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-translations"
RDEPENDS:${PN} += ""

inherit rpm
