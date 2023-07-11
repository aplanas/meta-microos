SUMMARY = "Binary files of tikztosvg"
DESCRIPTION = "Binary files of tikztosvg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55132"

RPM_NAME = "texlive-tikztosvg-bin-2023.20230311.svn55132-92.1.aarch64.rpm"
RPM_HASH = "5662a6966955e198168c4432561c3dc5811766d9154efcc208b09b748e634b2bcdd2c728d30ef52042a1e1e05114871822f77ae37cf3267d18d7231de0243349"

RPROVIDES:${PN} += "texlive-tikztosvg-bin"

RDEPENDS:${PN} += "texlive-tikztosvg"

inherit rpm
