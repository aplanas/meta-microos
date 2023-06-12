SUMMARY = "Icons in the PNG format for LateX2HTML"
DESCRIPTION = "Icons in the PNG format for the LaTeX to HTML Converter."
LICENSE = "GPL-2.0-or-later"

PV = "2023"

RPM_NAME = "latex2html-pngicons-2023-1.2.noarch.rpm"
RPM_HASH = "4a873e854c1dd46d8356769647c91aa6543f9b5745cbb143a96d17f846f9f70361767f92724738aee4ef046130fc62e69dc2348f305b0e7da9dd665978c8aeee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-pngicons"
RDEPENDS:${PN} += ""

inherit rpm
