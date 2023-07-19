SUMMARY = "Binary files of texdiff"
DESCRIPTION = "Binary files of texdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15506"

RPM_NAME = "texlive-texdiff-bin-2023.20230311.svn15506-93.1.aarch64.rpm"
RPM_HASH = "df4ef5587e4d7691e9742369c1097f53588c764af715b07e2b572a6b6d4f1ea468d56b4c9f578e0c907458a9704537865d84f69cf73a65591a57ef3b8ea6439b"

RPROVIDES:${PN} += "texlive-texdiff-bin"

RDEPENDS:${PN} += "texlive-texdiff"

inherit rpm
