SUMMARY = "Binary files of svn-multi"
DESCRIPTION = "Binary files of svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-svn-multi-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "4d83fb3a9505efadad01cd5bc8c01bcd8a24f51654f2fb1d788493b777f0b678e541d8b8d9fc3d6460b56771f9b833885bc6eefe7ee3d84e0a84282ea674caa8"

RPROVIDES:${PN} += "texlive-svn-multi-bin"

RDEPENDS:${PN} += "texlive-svn-multi"

inherit rpm
