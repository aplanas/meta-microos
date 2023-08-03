SUMMARY = "Samba Documentation"
DESCRIPTION = "This package contains all the Samba documentation as it is not part of \
the man pages."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-doc-4.18.5+git.313.c8e274c7852-1.1.noarch.rpm"
RPM_HASH = "2927126826f2ca08e8afa34847533ac01fffb7529c8d4b9dbfd9a79b22b61201aba276de601354bc23203ee0ad61c5ab0e5605821e81333640405fc34f0f6547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "samba-doc"

RDEPENDS:${PN} += "coreutils \
findutils"

inherit rpm
