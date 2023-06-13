SUMMARY = "Documentation of Botan"
DESCRIPTION = "Documentation of Botan package."
LICENSE = "BSD-2-Clause"

PV = "2.19.3"

RPM_NAME = "Botan-doc-2.19.3-1.4.noarch.rpm"
RPM_HASH = "7e6bb353bd8819e8a5d24c37ee16288f73d5dc57229b0c353cfd082fcec95c5158c602f2d376dd2db594c7a4eb2e42cf8cac4ce9a5b019df3a7537aa791ef6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Botan-doc"

RDEPENDS:${PN} += ""

inherit rpm
