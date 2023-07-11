SUMMARY = "Binary files of optexcount"
DESCRIPTION = "Binary files of optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn59817"

RPM_NAME = "texlive-optexcount-bin-2023.20230311.svn59817-92.1.aarch64.rpm"
RPM_HASH = "67b4979d0f92cab88156e06fb4b0320ee50382ec57e57dbc871b70d84135f5cf393d6d26d4693ad8c8fb4bbc97518ec1fdf79278cc6cd6b75e0f23e38b7ccace"

RPROVIDES:${PN} += "texlive-optexcount-bin"

RDEPENDS:${PN} += "texlive-optexcount"

inherit rpm
