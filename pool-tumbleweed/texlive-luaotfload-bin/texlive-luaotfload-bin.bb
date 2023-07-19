SUMMARY = "Binary files of luaotfload"
DESCRIPTION = "Binary files of luaotfload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34647"

RPM_NAME = "texlive-luaotfload-bin-2023.20230311.svn34647-93.1.aarch64.rpm"
RPM_HASH = "974c8dda49330d04c017d85cd0eb1fd87f959b197f918027558e9bd2fb382039d5c1d251be405ced5efe6e36abc8770e1f3915cddd2bd10436f96239309c32a3"

RPROVIDES:${PN} += "texlive-luaotfload-bin"

RDEPENDS:${PN} += "texlive-luaotfload"

inherit rpm
