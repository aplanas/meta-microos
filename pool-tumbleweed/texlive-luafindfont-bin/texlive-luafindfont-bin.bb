SUMMARY = "Binary files of luafindfont"
DESCRIPTION = "Binary files of luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61207"

RPM_NAME = "texlive-luafindfont-bin-2023.20230311.svn61207-91.1.aarch64.rpm"
RPM_HASH = "b67946064d2d1ae842a4b0ff39840175944d91dee26c1c37dba95e44c1df043277ab917cdbf4b34019cc16aed0b2bae8b72ab621c755b367a9669226c20952e9"

RPROVIDES:${PN} += "texlive-luafindfont-bin"

RDEPENDS:${PN} += "texlive-luafindfont"

inherit rpm
