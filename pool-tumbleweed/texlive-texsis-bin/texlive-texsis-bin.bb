SUMMARY = "Binary files of texsis"
DESCRIPTION = "Binary files of texsis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-texsis-bin-2023.20230311.svn3006-91.1.aarch64.rpm"
RPM_HASH = "35270df0f0beeb9e4ddb303c54af312358384197039836b9c3df9edb606e0ab04395d8256a89ca7e8eb847c95d43325ef3b05161fc9279119efd095d67a624a9"

RPROVIDES:${PN} += "texlive-texsis-bin \
texlive-texsis-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texsis"

inherit rpm
