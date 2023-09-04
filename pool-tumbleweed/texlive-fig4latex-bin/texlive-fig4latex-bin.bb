SUMMARY = "Binary files of fig4latex"
DESCRIPTION = "Binary files of fig4latex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14752"

RPM_NAME = "texlive-fig4latex-bin-2023.20230311.svn14752-93.2.aarch64.rpm"
RPM_HASH = "4dc62ffeeec9cd715a6b9f4ea4bbd6796fa96fdf50a7681ad1d19a08d360ca0d41211dab931f34bc23d21c683ac3e5b7bdb66f5e5162945597a972ae0fe9e4b2"

RPROVIDES:${PN} += "texlive-fig4latex-bin"

RDEPENDS:${PN} += "texlive-fig4latex"

inherit rpm
