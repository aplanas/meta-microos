SUMMARY = "Binary files of luafindfont"
DESCRIPTION = "Binary files of luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61207"

RPM_NAME = "texlive-luafindfont-bin-2023.20230311.svn61207-93.1.aarch64.rpm"
RPM_HASH = "81c26902c6d8132764e6d6bda8fd168c2dc3f7cd9511b31d92c3d895004df6b6511191f7d1488def76bdda3f54bc082d50543398dc5af56fe38ec7dc3a48b854"

RPROVIDES:${PN} += "texlive-luafindfont-bin"

RDEPENDS:${PN} += "texlive-luafindfont"

inherit rpm
