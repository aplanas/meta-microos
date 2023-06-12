SUMMARY = "Tsang Jei 3 table for Fcitx"
DESCRIPTION = "Fcitx Tsang Jei (Cang Jie) 3 table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-cangjie3-0.3.8-2.5.noarch.rpm"
RPM_HASH = "04c76b1cf9c05476b93d9aa1cc3e95b66dffc1dc3f36d03789ba1fd3135cc7071c14567a3d4fdef8e23946b2475f796476c215dc4e0920107ca0c993ed76a25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-cangjie3"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
