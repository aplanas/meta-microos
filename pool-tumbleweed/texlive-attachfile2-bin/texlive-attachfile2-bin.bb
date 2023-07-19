SUMMARY = "Binary files of attachfile2"
DESCRIPTION = "Binary files of attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52909"

RPM_NAME = "texlive-attachfile2-bin-2023.20230311.svn52909-93.1.aarch64.rpm"
RPM_HASH = "841bd529984a16309d5e3aa11208bb24b50809c23cd1ed210e910c21ee7ce7cc8b03a934da84a68f2eb4ecad5b41ffa9653a71c931262101f9131ab4a04320c0"

RPROVIDES:${PN} += "texlive-attachfile2-bin \
texlive-pdftools-bin-/usr/bin/pdfatfi"

RDEPENDS:${PN} += "texlive-attachfile2"

inherit rpm
