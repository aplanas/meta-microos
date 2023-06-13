SUMMARY = "Lua-based Environment Modules used in HPC"
DESCRIPTION = "Lmod is an Environment Module System as used in High Performance Computing \
(HPC) based on Lua, Reads TCL Modules, Supports a Software Hierarchy. \
Environment Modules are to select the individual versions of HPC libraries \
and tools from a set of installed ones. \
It requires these libraries and tools to be available in separate independent \
directory structures. On SUSE systems default location for these structures \
is under /usr/lib/hpc. \
 \
It is not recommended to install this tool on systems which do not belong \
to an HPC deployment which uses the module system."
LICENSE = "MIT"

PV = "8.7.17"

RPM_NAME = "lua-lmod-8.7.17-2.1.aarch64.rpm"
RPM_HASH = "9149cd89e70bd39a9b570bb7114fe928815c70f20ef06ea09063bb989a1cbd42364c534accd94ccc6cafd8eb063903fa5b4591a81efafbbab40b258760df825c"

RPROVIDES:${PN} += "config(lua-lmod) \
lua-lmod \
lua-lmod(aarch-64) \
lua-lmod-man \
ml \
modules \
rpm_macro(lua_lmod_admin_modulesdir) \
rpm_macro(lua_lmod_moduledeps) \
rpm_macro(lua_lmod_modulesdir)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/lua5.4 \
/usr/bin/tclsh \
lua54-luafilesystem \
lua54-luaposix \
lua54-luaterm \
tcl"

inherit rpm
