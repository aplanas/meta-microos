SUMMARY = "Binary files of mex"
DESCRIPTION = "Binary files of mex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-mex-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "b3cb2dc3a4ea968059cef6307db1221c1c067dea0c001a522be6d11d1507e6eaefb655979b633f88826f4c6daeb937c16e6fa3413d7340a04b117923e8541ce5"

RPROVIDES:${PN} += "texlive-mex-bin \
texlive-mex-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-mex"

inherit rpm
