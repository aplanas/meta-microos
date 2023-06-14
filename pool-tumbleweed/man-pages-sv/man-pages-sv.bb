SUMMARY = "Translation of man pages in Swedish"
DESCRIPTION = "This package provides translations of man pages in Swedish."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-sv-4.19.0-1.1.noarch.rpm"
RPM_HASH = "06724dea30eb7e41ea99c906ae81ad88728c2280244788f2607560cdab7b4071bbf91b373a8dd7d281c3e72b6b835666b9817bb27230082d9d9bbea0784d3e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-sv \
man-pages-sv"

RDEPENDS:${PN} += "man-pages"

inherit rpm
