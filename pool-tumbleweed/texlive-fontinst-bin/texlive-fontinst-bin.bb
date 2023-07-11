SUMMARY = "Binary files of fontinst"
DESCRIPTION = "Binary files of fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53554"

RPM_NAME = "texlive-fontinst-bin-2023.20230311.svn53554-92.1.aarch64.rpm"
RPM_HASH = "fe95ea5d04ae4ae1e7a6b4dcc0099a218c7eef0242e9e3a3ce187507917c81cd52bec3233970819bf37c05505de51f02073f8ecbfa00b65e09d894e80848c4c7"

RPROVIDES:${PN} += "texlive-fontinst-bin"

RDEPENDS:${PN} += "texlive-fontinst"

inherit rpm
