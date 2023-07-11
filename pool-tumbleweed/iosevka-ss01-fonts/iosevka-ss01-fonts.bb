SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss01-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "04a22afeb4c8c878f6ff3a7a56ce3027543bf80ab67f612f94b4ddf275cf2c9b6af2bffad2e18edcc63247483752c7331d54cc7a6946a0e8dea105753727bbb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
