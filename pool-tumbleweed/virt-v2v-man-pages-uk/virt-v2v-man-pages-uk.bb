SUMMARY = "Ukrainian (uk) man pages for virt-v2v"
DESCRIPTION = "virt-v2v-man-pages-uk contains Ukrainian (uk) man pages \
for virt-v2v."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "virt-v2v-man-pages-uk-2.0.7-2.3.noarch.rpm"
RPM_HASH = "ea7cad7660ec57cb51df6ff86558e7b45a29c165b8089b5e3f46b2a801c041f2dc974812a4dc634e845e9dadb9e11575839057282745acfa1c0c0a0015457301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-v2v-man-pages-uk"

RDEPENDS:${PN} += "virt-v2v"

inherit rpm
