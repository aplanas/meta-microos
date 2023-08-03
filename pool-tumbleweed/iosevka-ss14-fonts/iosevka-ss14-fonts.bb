SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss14-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "ab1e418b65294c6e1003436c06685e8a2da6aa21541f2ac6cc4614e4593581c77ca75af066e563d32685132bd2d8cded4967f3b765537ee27cdf8d58329e9039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
