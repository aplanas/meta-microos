SUMMARY = "Cheng table for Fcitx"
DESCRIPTION = "Fcitx Cheng (Zheng Ma) table for Simplified Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-cn-zhengma-0.3.8-2.5.noarch.rpm"
RPM_HASH = "dfdf694bf3eccc2ac7339af5b99a67c4f1054207602b71d52add2be0e9491f98309cc6f1584344a107b72f8ddcbc1569b535a991ec84042168648b1c5065fe71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-zhengma \
fcitx-table-extra"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
