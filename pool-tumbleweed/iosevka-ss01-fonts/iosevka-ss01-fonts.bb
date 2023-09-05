SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss01-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "841a80620ce597d606f90067dafe4ca058d4ed39f58dda2155999e6f71ad6b442509db069b185e10173c080cfb421c575e46505b97acf276bd1c22af1a66a593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
