SUMMARY = "Binary files of latexmk"
DESCRIPTION = "Binary files of latexmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn10937"

RPM_NAME = "texlive-latexmk-bin-2023.20230311.svn10937-93.1.aarch64.rpm"
RPM_HASH = "9a805cf014e970998e30108d3acc91818f0a9ae34f4718bf182764fbefa95a5c7cfa512b442d0c439a0ef3db9fe8f0a83cb430d5b13b8174ff7d9440c985226e"

RPROVIDES:${PN} += "texlive-latexmk-bin"

RDEPENDS:${PN} += "texlive-latexmk"

inherit rpm
