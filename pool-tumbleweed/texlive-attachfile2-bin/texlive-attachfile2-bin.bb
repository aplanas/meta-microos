SUMMARY = "Binary files of attachfile2"
DESCRIPTION = "Binary files of attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52909"

RPM_NAME = "texlive-attachfile2-bin-2023.20230311.svn52909-92.1.aarch64.rpm"
RPM_HASH = "173deb15f5033afce1b4f5a744456881cbe4298105015183eff1d62fae127155c133a20bdd62169071ba0ba4f82e30b44efb15b2e3f906135080eb81842b9b57"

RPROVIDES:${PN} += "texlive-attachfile2-bin \
texlive-pdftools-bin-/usr/bin/pdfatfi"

RDEPENDS:${PN} += "texlive-attachfile2"

inherit rpm
