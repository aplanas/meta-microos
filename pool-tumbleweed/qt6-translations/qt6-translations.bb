SUMMARY = "Qt 6 Translations"
DESCRIPTION = "Translations for Qt6 libraries and tools."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-translations-6.5.2-1.1.noarch.rpm"
RPM_HASH = "8a7f261714fa5e77f1975021050bd7a93da39a829281199799834314d29ea3cf6e9f71ac05399d7ef6eb810548aa1ad0219d4c02f740da1827179a7c986f63c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-translations"

RDEPENDS:${PN} += ""

inherit rpm
