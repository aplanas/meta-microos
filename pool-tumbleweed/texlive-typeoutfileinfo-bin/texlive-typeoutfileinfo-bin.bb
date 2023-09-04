SUMMARY = "Binary files of typeoutfileinfo"
DESCRIPTION = "Binary files of typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25648"

RPM_NAME = "texlive-typeoutfileinfo-bin-2023.20230311.svn25648-93.2.aarch64.rpm"
RPM_HASH = "f97aa2a41e73f08e474092e5540a4ca5de9bb986bbaf93edac1d283d6f7bf6c7d78f9e9a13a56265a2c6494c2f395d415214b9f8b8e1ad07b05d125b39f38d4d"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-bin"

RDEPENDS:${PN} += "texlive-typeoutfileinfo"

inherit rpm
