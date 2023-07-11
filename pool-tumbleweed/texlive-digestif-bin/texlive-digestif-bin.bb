SUMMARY = "Binary files of digestif"
DESCRIPTION = "Binary files of digestif"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65210"

RPM_NAME = "texlive-digestif-bin-2023.20230311.svn65210-92.1.aarch64.rpm"
RPM_HASH = "827186ef317341355b6f266d13b7f19137c77f1e209445676363c7a792070a9581548e3607a532b04ce19a983046006482901fcd4d94965e86c2321f6a5b4fca"

RPROVIDES:${PN} += "texlive-digestif-bin"

RDEPENDS:${PN} += "texlive-digestif"

inherit rpm
