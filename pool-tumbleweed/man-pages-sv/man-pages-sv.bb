SUMMARY = "Translation of man pages in Swedish"
DESCRIPTION = "This package provides translations of man pages in Swedish."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-sv-4.20.0-1.1.noarch.rpm"
RPM_HASH = "141b3e24b6ba6003f1ce30f5954b55e92f6f97678e7c86504cb06561d4697a8f8212f68b496167c5825af83fa59cac08f428a7be7e0f99e938d9f5b4676bf797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-sv \
man-pages-sv"

RDEPENDS:${PN} += "man-pages"

inherit rpm
