SUMMARY = "Binary files of l3build"
DESCRIPTION = "Binary files of l3build"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46894"

RPM_NAME = "texlive-l3build-bin-2023.20230311.svn46894-93.1.aarch64.rpm"
RPM_HASH = "640ba006a736eb100d7f3cfd89c160ccd908bce7e577c006a30cd9b4f3a4cbc913091ad744efa1db6618917fc4bf0c292bde78abdaadad25efcc0bad3cfd8416"

RPROVIDES:${PN} += "texlive-l3build-bin"

RDEPENDS:${PN} += "texlive-l3build"

inherit rpm
