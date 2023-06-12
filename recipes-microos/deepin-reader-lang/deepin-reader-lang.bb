SUMMARY = "Translations for package deepin-reader"
DESCRIPTION = "Provides translations for the 'deepin-reader' package."
LICENSE = "GPL-3.0+"

PV = "5.10.23"

RPM_NAME = "deepin-reader-lang-5.10.23-1.5.noarch.rpm"
RPM_HASH = "c9d0bcd28ec65ee2fdc84041fa1ebe3e76802b2ac02161b26dab83cf3dca22e6717eeaa956a900740d56e080e9cbf98da6778883728d5249334e44cc5982e9fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-reader-lang \
deepin-reader-lang-all"
RDEPENDS:${PN} += "deepin-reader"

inherit rpm
