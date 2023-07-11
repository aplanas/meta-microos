SUMMARY = "Developer documentation for libadwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the documentation for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libadwaita-docs-1.3.3-1.1.noarch.rpm"
RPM_HASH = "950ed0731075230d4139568584ec2dad3140158ed9ece3efeff77f61218cfa5d957953a7b82215983beb78911dc42e93eda9845d45ca92d3ccdfef539c57d39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-docs"

RDEPENDS:${PN} += ""

inherit rpm
