SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss05-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "a3a9fef3bb5d555d28b9a8a39c112e6dfae6e17a7c05054bda594b7a1b3dff820d6abc19360f834d3df71ccb164e2b8877e6c885f506e2bb50371b488f96d5f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
