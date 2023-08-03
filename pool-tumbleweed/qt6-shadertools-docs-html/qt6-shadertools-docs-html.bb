SUMMARY = "Documentation for qt6-shadertools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-shadertools-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6d9e7a0443b0b3b2f32622f2e9f0f64ab132de27337c195631f26f0588f4fdb8a913e624a534deed2909de8aaf70118074f8b1c80c3d89f098f3282eb92d0d04"

RPROVIDES:${PN} += "qt6-shadertools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
