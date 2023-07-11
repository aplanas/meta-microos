SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss16-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "80c9f3f2fca3c549056cb6474d4af4c5b19efc16c32f51f8241fb5ea079c811fc4bec05f9a37c5ab75256e081287e1d28ec9a53a45a7e9fa0cd1df9eb42b7b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
