SUMMARY = "Documentation for VIPS library"
DESCRIPTION = "This package contains documentation about the VIPS library in HTML and PDF \
formats."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "vips-doc-8.13.3-1.5.noarch.rpm"
RPM_HASH = "7f78fe6861f8b79bab66844963babf38ae6ffbab9fe0e61ae13d9ac5dcad4c32d9c77258d7eeb0f8c99a78cf9e5d715b10bf823bd50e7dfe51026ddc79e9af5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vips-doc"
RDEPENDS:${PN} += "libvips42"

inherit rpm
