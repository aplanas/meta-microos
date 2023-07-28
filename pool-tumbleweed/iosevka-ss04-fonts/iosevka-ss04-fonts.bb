SUMMARY = "Iosevka in monospace, Menlo style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS04 typeface (monospace, Menlo style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss04-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "0dfd7ae7c030f2e996ecf76e142736d379018e0232b974f8ae9f01bfea3711ab7bc7d9e20cc8736f5907f8465a31ac3a8bb1f880f5e509e2a469c6c4b615581a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss04-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
