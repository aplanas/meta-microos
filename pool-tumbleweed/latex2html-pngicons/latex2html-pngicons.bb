SUMMARY = "Icons in the PNG format for LateX2HTML"
DESCRIPTION = "Icons in the PNG format for the LaTeX to HTML Converter."
LICENSE = "GPL-2.0-or-later"

PV = "2023"

RPM_NAME = "latex2html-pngicons-2023-1.3.noarch.rpm"
RPM_HASH = "8dd5ad3250fbb3bc2bf23b62749db6f62179fbdeef2bf1c0592e39a3386fdd6194f5daa007c875523e537359d98dde574bd728972278268ea964f1a28c542d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-pngicons"

RDEPENDS:${PN} += ""

inherit rpm
