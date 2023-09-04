SUMMARY = "Binary files of attachfile2"
DESCRIPTION = "Binary files of attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52909"

RPM_NAME = "texlive-attachfile2-bin-2023.20230311.svn52909-93.2.aarch64.rpm"
RPM_HASH = "518db1d4fa5561b7d71c22928b035a3896aa84b073eec8c98ec0803f5c5baa79de3410401c15d2638bee7a9c0e4fd968eb9eae681b34e8c7460299e109ba46af"

RPROVIDES:${PN} += "texlive-attachfile2-bin \
texlive-pdftools-bin-/usr/bin/pdfatfi"

RDEPENDS:${PN} += "texlive-attachfile2"

inherit rpm
