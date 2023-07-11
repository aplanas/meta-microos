SUMMARY = "Binary files of luaotfload"
DESCRIPTION = "Binary files of luaotfload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34647"

RPM_NAME = "texlive-luaotfload-bin-2023.20230311.svn34647-92.1.aarch64.rpm"
RPM_HASH = "f64dfba331a27743bc3c09c4750e63242b0d49c2ae957b35088700eaa148a9a3dc7f4c8479214acddfeb83fe3a9a1acf86c64a1d9b02594ad63fe1df29ff9521"

RPROVIDES:${PN} += "texlive-luaotfload-bin"

RDEPENDS:${PN} += "texlive-luaotfload"

inherit rpm
