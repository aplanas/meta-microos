SUMMARY = "Binary files of crossrefware"
DESCRIPTION = "Binary files of crossrefware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45927"

RPM_NAME = "texlive-crossrefware-bin-2023.20230311.svn45927-91.1.aarch64.rpm"
RPM_HASH = "40bb0e5b70ba0f6ac81af3166a029900c82990ccd111ac07f334f7b045637e6578f67561baa45d9e875c0d479e183c3055e38b6495ad95efb94449d6f55d7641"

RPROVIDES:${PN} += "texlive-crossrefware-bin \
texlive-crossrefware-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-crossrefware"

inherit rpm
