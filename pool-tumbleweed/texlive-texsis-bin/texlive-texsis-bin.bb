SUMMARY = "Binary files of texsis"
DESCRIPTION = "Binary files of texsis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-texsis-bin-2023.20230311.svn3006-93.1.aarch64.rpm"
RPM_HASH = "7181c53e094c3595ca388575405bdc4e794f0cb347a15e011dc28981bdbd5e9d4d434f50b64e30914417229c7035f11a75f8f0db1c023193e7ef85b0a5c7c20b"

RPROVIDES:${PN} += "texlive-texsis-bin"

RDEPENDS:${PN} += "texlive-texsis"

inherit rpm
