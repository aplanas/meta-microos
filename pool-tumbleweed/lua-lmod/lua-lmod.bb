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

RPM_NAME = "lua-lmod-8.7.17-3.1.aarch64.rpm"
RPM_HASH = "f873498f38a0dc6756214bddf4944542e13030e57c1a0b156ae6790fdee82a01612e443301f033d49f23ea661bfaafec17385d91863bf6a06a61dc088a85e438"

RPROVIDES:${PN} += "config-lua-lmod \
environment-modules \
lua-lmod \
lua-lmod-man \
ml \
rpm-macro-lua-lmod-admin-modulesdir \
rpm-macro-lua-lmod-moduledeps \
rpm-macro-lua-lmod-modulesdir"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/lua5.4 \
/usr/bin/sh \
/usr/bin/tclsh \
lua54-luafilesystem \
lua54-luaposix \
lua54-luaterm \
tcl"

inherit rpm
