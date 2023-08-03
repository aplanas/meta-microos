SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss16-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "65fea27ae662728d6ad6212e3c2ddf7eba01f31b2364c37acfea2896f5e4fc385f9f46ef33d717598f7fad964471cf404cd8b8247b7b6dfb5e96d7ec67360ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
