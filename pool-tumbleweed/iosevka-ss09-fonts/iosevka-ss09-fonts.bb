SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss09-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "d522265275915fedf7f901c172d3731ec97b9c4f28ad573ab4390ef439d7b5f285f39d9fb4ee0dba0f7e2c8f9a722630ee08276c1bb0a18a388a40d066748c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
