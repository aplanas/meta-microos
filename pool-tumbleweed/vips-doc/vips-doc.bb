SUMMARY = "Documentation for VIPS library"
DESCRIPTION = "This package contains documentation about the VIPS library in HTML and PDF \
formats."
LICENSE = "LGPL-2.1-only"

PV = "8.14.2"

RPM_NAME = "vips-doc-8.14.2-1.1.noarch.rpm"
RPM_HASH = "80d72491a0b888bff89e22b353db81acb6da972d8036ed4a3a80ad4ea69bca65de471d88ca5c391540e5ad6429bc96534bd7c8feb21d71a8673670bde69bfd9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vips-doc"

RDEPENDS:${PN} += "libvips42"

inherit rpm
