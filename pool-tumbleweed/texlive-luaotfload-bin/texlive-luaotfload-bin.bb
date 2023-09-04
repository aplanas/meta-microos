SUMMARY = "Binary files of luaotfload"
DESCRIPTION = "Binary files of luaotfload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34647"

RPM_NAME = "texlive-luaotfload-bin-2023.20230311.svn34647-93.2.aarch64.rpm"
RPM_HASH = "52d3841be5d610a88441a783db33e2204b72f483ace5377da2a8563f926c901beab2d2f6454d8555a0180db808cb4cfbba88b46e6cbe77587776fe41cb31143c"

RPROVIDES:${PN} += "texlive-luaotfload-bin"

RDEPENDS:${PN} += "texlive-luaotfload"

inherit rpm
