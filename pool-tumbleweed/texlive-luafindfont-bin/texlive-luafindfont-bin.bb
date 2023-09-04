SUMMARY = "Binary files of luafindfont"
DESCRIPTION = "Binary files of luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61207"

RPM_NAME = "texlive-luafindfont-bin-2023.20230311.svn61207-93.2.aarch64.rpm"
RPM_HASH = "36502fc05c647488156179a89df34e596bfbde9f1a10954b57fff102524b753d511024ffee26a20a3e52fe07e3b22cf8655cbbd744ecbdb9f8f580b3d24e2de6"

RPROVIDES:${PN} += "texlive-luafindfont-bin"

RDEPENDS:${PN} += "texlive-luafindfont"

inherit rpm
