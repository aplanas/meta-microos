SUMMARY = "Binary files of fig4latex"
DESCRIPTION = "Binary files of fig4latex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14752"

RPM_NAME = "texlive-fig4latex-bin-2023.20230311.svn14752-92.1.aarch64.rpm"
RPM_HASH = "3848973b42ea08231f7704826e89595b739227c3dc0f13945e67e5f4f137a522c6c1c381ff8bcedf9edf02e17ee0c0e4048593409ddbe0763186d59c05362135"

RPROVIDES:${PN} += "texlive-fig4latex-bin"

RDEPENDS:${PN} += "texlive-fig4latex"

inherit rpm
