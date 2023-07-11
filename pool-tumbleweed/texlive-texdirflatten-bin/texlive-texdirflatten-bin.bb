SUMMARY = "Binary files of texdirflatten"
DESCRIPTION = "Binary files of texdirflatten"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn12782"

RPM_NAME = "texlive-texdirflatten-bin-2023.20230311.svn12782-92.1.aarch64.rpm"
RPM_HASH = "9de67897bc3cb04683f6cfb193ebdc4db2d466e9ea92f8021927f9a9238bca6b6e8e3daece06d8cbdd0a0ca6e7c185d95ae36be60a3053ee8020fa4e52f34f84"

RPROVIDES:${PN} += "texlive-texdirflatten-bin"

RDEPENDS:${PN} += "texlive-texdirflatten"

inherit rpm
