SUMMARY = "Binary files of pst2pdf"
DESCRIPTION = "Binary files of pst2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29333"

RPM_NAME = "texlive-pst2pdf-bin-2023.20230311.svn29333-93.2.aarch64.rpm"
RPM_HASH = "45742f4d2b3eaebc29ff7c9ba3b23eec756d2eb6a5dd01bfc5aca99345285399a81fc4600ffd3feba909eafcb1e09503c5c7f74cc3b9b6d09dc2c67fe90aa4fa"

RPROVIDES:${PN} += "texlive-pst2pdf-bin"

RDEPENDS:${PN} += "texlive-pst2pdf"

inherit rpm
