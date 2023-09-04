SUMMARY = "Binary files of cluttex"
DESCRIPTION = "Binary files of cluttex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48871"

RPM_NAME = "texlive-cluttex-bin-2023.20230311.svn48871-93.2.aarch64.rpm"
RPM_HASH = "14c1dd925e284853d6ed38643fcb34c3d98e41cf42120cb31f94c34a4efd81c6b1b0ffc87f783d513bf39bd515693387424f6f8f5d4b7c8d6c70184f5fbe58b2"

RPROVIDES:${PN} += "texlive-cluttex-bin"

RDEPENDS:${PN} += "texlive-cluttex"

inherit rpm
