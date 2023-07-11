SUMMARY = "Binary files of latexmk"
DESCRIPTION = "Binary files of latexmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10937"

RPM_NAME = "texlive-latexmk-bin-2023.20230311.svn10937-92.1.aarch64.rpm"
RPM_HASH = "eb489ade7bf6098409e5dd4d8b05df72a788d370cd7b99b4bb693c77b221068db5d22baf73253ac8595342f80463ee2afd1c11e0f9cd0c4a20ce16620606d955"

RPROVIDES:${PN} += "texlive-latexmk-bin"

RDEPENDS:${PN} += "texlive-latexmk"

inherit rpm
