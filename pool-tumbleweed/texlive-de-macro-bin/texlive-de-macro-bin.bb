SUMMARY = "Binary files of de-macro"
DESCRIPTION = "Binary files of de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17399"

RPM_NAME = "texlive-de-macro-bin-2023.20230311.svn17399-92.1.aarch64.rpm"
RPM_HASH = "d0d4053c64f32ab7672bf73c4a2cacea56a2ec54addb4f595a5987e6e9f270aee2cee5188478214fabc394a12f19b83e4cda045dc2b5a35eb1ecf5c7a5b41aef"

RPROVIDES:${PN} += "texlive-de-macro-bin"

RDEPENDS:${PN} += "texlive-de-macro"

inherit rpm
