SUMMARY = "Binary files of de-macro"
DESCRIPTION = "Binary files of de-macro"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn17399"

RPM_NAME = "texlive-de-macro-bin-2023.20230311.svn17399-93.2.aarch64.rpm"
RPM_HASH = "f96c1a2e10a658c17aa3880202eb827ee9efd0009f0fbf40b0e8da5d560ee2035a87a9c6b6cf8ccac49316fa24e5102041eb4bfd5b8b1bb64fbe8fed2ee29b18"

RPROVIDES:${PN} += "texlive-de-macro-bin"

RDEPENDS:${PN} += "texlive-de-macro"

inherit rpm
