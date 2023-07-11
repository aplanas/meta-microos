SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss05-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "e8f22e5f0f4ef41e22d82de1e128c75e74fbbd5c255ea47d76675989367420db2412705e063ed263a4683406f88b17d48ed54951b6353d2af52c31deffaa9e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
