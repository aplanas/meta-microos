SUMMARY = "Binary files of ulqda"
DESCRIPTION = "Binary files of ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-ulqda-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "4b96d2f3cf6d6d184074038b68b9ae96720862544474648cdeb7372bb799d75fcba27f8276f658160768386a937cf7a0c38423c232c25ba81685b181c6a46d6a"

RPROVIDES:${PN} += "texlive-ulqda-bin"

RDEPENDS:${PN} += "texlive-ulqda"

inherit rpm
