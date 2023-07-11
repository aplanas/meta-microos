SUMMARY = "Ukrainian (uk) man pages for virt-v2v"
DESCRIPTION = "virt-v2v-man-pages-uk contains Ukrainian (uk) man pages \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "virt-v2v-man-pages-uk-2.2.0-1.1.noarch.rpm"
RPM_HASH = "f7727a72f9a1f4fcef2e531bf6fac8d004b05b01eedfa9fa03badcc7f016db8228a88c7bc902b53ea030d3ee6448f481211236891c46de8fa04257dbe229da66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-man-pages-uk"

RDEPENDS:${PN} += "virt-v2v"

inherit rpm
