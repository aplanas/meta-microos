SUMMARY = "Iosevka in monospace, Anonymous Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS02 typeface (monospace, Anonymous Pro \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss02-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "5dab50eda6322dbea7b729035a6243adf59a75f2ee98c8e748e4a6b9ba45fbf566aef55b7ae9e9c26f3b84fd4a0b2578ffbeca852bd8940b74242517a8c6cbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss02-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
