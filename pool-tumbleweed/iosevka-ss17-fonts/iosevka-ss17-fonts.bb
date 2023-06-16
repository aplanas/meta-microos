SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss17-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "aebe8c4b33c0c8533fabed49db364ee9e1adc0e998351487872af539344823e00167e535140a79a47a5705daf5b7f15c54a571445d196658c718155a6e4874d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
