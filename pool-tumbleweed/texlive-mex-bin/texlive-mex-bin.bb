SUMMARY = "Binary files of mex"
DESCRIPTION = "Binary files of mex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mex-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "90e09f74e0c14adc6f2241099985088b744bdab46543d8d6f2828c7b64d616168bdbda04179843ade1de72f33a2c85e01cbacf417df4de82449261ca94a28da9"

RPROVIDES:${PN} += "texlive-mex-bin"

RDEPENDS:${PN} += "texlive-mex"

inherit rpm
