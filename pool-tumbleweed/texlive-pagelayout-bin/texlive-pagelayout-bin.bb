SUMMARY = "Binary files of pagelayout"
DESCRIPTION = "Binary files of pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65625"

RPM_NAME = "texlive-pagelayout-bin-2023.20230311.svn65625-93.1.aarch64.rpm"
RPM_HASH = "be48a846c68260418d4f8903155bd309895787ec729beadabcac7537740aa154809774487e3b488a5014754271485f7c4f992744d5176fb1d2903a414f99381d"

RPROVIDES:${PN} += "texlive-pagelayout-bin"

RDEPENDS:${PN} += "texlive-pagelayout"

inherit rpm
