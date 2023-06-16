SUMMARY = "Iosevka in monospace, Anonymous Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS02 typeface (monospace, Anonymous Pro \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss02-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "8239ece2c6b02a0f906791133eca92faa82b2db08222d1ef029003a6ae7d4d4b0e8bee9f599b4923bc972fca0790704b0ae8e6df559700315e77a24d31a6f225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss02-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
