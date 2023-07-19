SUMMARY = "Binary files of csplain"
DESCRIPTION = "Binary files of csplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50528"

RPM_NAME = "texlive-csplain-bin-2023.20230311.svn50528-93.1.aarch64.rpm"
RPM_HASH = "8a382d21dcdb4cbf1c9c70bb7729bce4b884e5ff41aee550ffa7e8a9178a25af99a97ba82ebbd148012bc92dbab54721d075e7633653b374cef9ac596dcee8d4"

RPROVIDES:${PN} += "texlive-csplain-bin"

RDEPENDS:${PN} += "texlive-csplain"

inherit rpm
