SUMMARY = "Japanese (ja) man pages for virt-v2v"
DESCRIPTION = "virt-v2v-man-pages-ja contains Japanese (ja) man pages \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "virt-v2v-man-pages-ja-2.0.7-2.3.noarch.rpm"
RPM_HASH = "f2b71f119ff154f133e02de4e73604aedde6166abdd2c5ad39b7295b7a64de5c661758516888d5354e7427d410c896cab3021bb93291e2fcb643a29758591c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-man-pages-ja"

RDEPENDS:${PN} += "virt-v2v"

inherit rpm
