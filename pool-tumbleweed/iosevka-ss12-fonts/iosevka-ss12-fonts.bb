SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss12-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "f1c1b8b1e0b468b26fdde8d7a59eb85c0e3f498e0e5d6d30fa6ae7ba8dd3ca19d62f7ed7936620418a91ce8fa79cd1e4cf881083360a983e033b1a4d561a04b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
