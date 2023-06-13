SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-ss14-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "e5801e7ebd15191c7750c5909730668d2f932db13e47194a845138ef8e148fd89817d569fe0bd870f8c4066517accbbb5d0ae89f3c897948b02904c9a3a5088b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
