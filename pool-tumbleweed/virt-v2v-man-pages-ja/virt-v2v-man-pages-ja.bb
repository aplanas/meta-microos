SUMMARY = "Japanese (ja) man pages for virt-v2v"
DESCRIPTION = "virt-v2v-man-pages-ja contains Japanese (ja) man pages \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "virt-v2v-man-pages-ja-2.2.0-1.1.noarch.rpm"
RPM_HASH = "a26316aec234e5150930f164b7902c7c2ad656d1fa6723ac4612ed27df2e39588bf6553a31c67b0728b85f183b95d70b426aab77271cc8247e52ab1ee01d937c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-man-pages-ja"

RDEPENDS:${PN} += "virt-v2v"

inherit rpm
