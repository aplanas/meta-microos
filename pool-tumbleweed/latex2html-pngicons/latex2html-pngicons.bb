SUMMARY = "Icons in the PNG format for LateX2HTML"
DESCRIPTION = "Icons in the PNG format for the LaTeX to HTML Converter."
LICENSE = "GPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "latex2html-pngicons-2023.2-1.1.noarch.rpm"
RPM_HASH = "7aabf695927fb4abdd8055e3a36ad0196d4f864cd187d4781c3b3d4cb92502249a7d41f48e238fcd60a21948facefa1e0bd5c7acdcb3dc145115c399eb7be1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-pngicons"

RDEPENDS:${PN} += ""

inherit rpm
