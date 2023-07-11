SUMMARY = "Binary files of luafindfont"
DESCRIPTION = "Binary files of luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61207"

RPM_NAME = "texlive-luafindfont-bin-2023.20230311.svn61207-92.1.aarch64.rpm"
RPM_HASH = "6f5fa72d91682ff68060777944c34e4ea4650bc04cab44afef9bc51da038142fd8eb5c93ef984000594f850f257b9aff45598d580fe14233c93a2b7ecf7055c3"

RPROVIDES:${PN} += "texlive-luafindfont-bin"

RDEPENDS:${PN} += "texlive-luafindfont"

inherit rpm
