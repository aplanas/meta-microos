SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss12-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "568dce0b8d5b4d4b45a743dae023782b888c839531c8bf23747630f1de66dfd0596f39f49a8465ed08443a0dc8f97bec1873073a455ca9e43de8ea3a9014c5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
