SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss06-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "bca37c5ea4d9281797998f6fb9b75a86dcec61cd2a143e500c811d7319ecec89238a15990f74c4d34b401d2e884906f01a2fac5bae8d0b5da6aa2d087fd09641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
