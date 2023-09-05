SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss08-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "3f1fde118d713ec4bc4ea9010282729d688290f5e2f1a087ea5b52625b02cf159a846ae4765a010d9697c3e8e6b2b6e54074e0d0e891ac1a150b5cff659ad9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
