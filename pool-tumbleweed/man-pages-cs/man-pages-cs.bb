SUMMARY = "Translation of man pages in Czech"
DESCRIPTION = "This package provides translations of man pages in Czech."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-cs-4.19.0-1.1.noarch.rpm"
RPM_HASH = "cf5a5afec39dc0b4b40b240b3f726785fbe7c962202ca2898977657e81a1469cf607b617d94d158eebb719acdd46366bbb568b236adffa1395ba60ea4931bd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:cs) \
man-pages-cs"
RDEPENDS:${PN} += "man-pages"

inherit rpm
