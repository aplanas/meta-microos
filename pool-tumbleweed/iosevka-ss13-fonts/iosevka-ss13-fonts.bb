SUMMARY = "Iosevka in monospace, Lucida style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS13 typeface (monospace, Lucida style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss13-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "8232ee6e123008971a5fd39eb881673c24920d116e4096f1ad4e3183be5777270b4068e57ccec4c265183b4cfa1bc818dbb830edc5535037c06c723249a2648b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss13-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
