SUMMARY = "EditorConfig Core support for the Lua language"
DESCRIPTION = "EditorConfig makes it easy to maintain the correct coding \
style when switching between different text editors \
and betweendifferent projects. The EditorConfig project \
maintains a file format and plugins for various text editors \
which allow this file format to be read and used by those \
editors. EditorConfig Lua Core provides the same functionality \
as the Editorconfig C Core library."
LICENSE = "BSD-2-Clause"

PV = "0.3.0"

RPM_NAME = "lua54-editorconfig-core-lua-0.3.0-4.4.aarch64.rpm"
RPM_HASH = "888ed9acf44eab6e943a06594b8aa26cb985a9d5a9c0d4363d3fd3f5ceb0823103711e13b33c34492677f8ae59ac78e15b0407d251a4e0fe15d5ffdba5598c04"

RPROVIDES:${PN} += "lua-editorconfig-core-lua \
lua54-LPeg \
lua54-editorconfig-core-lua \
lua54-editorconfig-core-lua(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libeditorconfig.so.0()(64bit) \
lua54"

inherit rpm
