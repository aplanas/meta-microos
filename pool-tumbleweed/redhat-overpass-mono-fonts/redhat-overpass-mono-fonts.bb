SUMMARY = "Overpass Mono typeface"
DESCRIPTION = "Overpass is a (sans-serif) font family inspired by Highway Gothic. \
 \
This package contains the monospace variants in OpenType format."
LICENSE = "OFL-1.1"

PV = "3.0.5"

RPM_NAME = "redhat-overpass-mono-fonts-3.0.5-1.1.noarch.rpm"
RPM_HASH = "0991070846ddd08dda02c244b6d19a6a2b41c8ea6f34306a78f5676c6b8a8d136bcf4a2a18b30e5b74029b98d2d956f6dc018090b163c4919e0f7b22b233e30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redhat-overpass-mono-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
