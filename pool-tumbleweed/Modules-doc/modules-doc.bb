SUMMARY = "Documentation for Environment Modules"
DESCRIPTION = "The Modules package is a tool that simplify shell initialization and lets \
users easily modify their environment during the session with modulefiles. \
 \
Each modulefile contains the information needed to configure the shell for an \
application. Once the Modules package is initialized, the environment can be \
modified on a per-module basis using the module command which interprets \
modulefiles. Typically modulefiles instruct the module command to alter or set \
shell environment variables such as PATH, MANPATH, etc. modulefiles may be \
shared by many users on a system and users may have their own collection to \
supplement or replace the shared modulefiles. \
 \
Modules can be loaded and unloaded dynamically and atomically, in an clean \
fashion. All popular shells are supported, including bash, ksh, zsh, sh, csh, \
tcsh, fish, as well as some scripting languages such as tcl, perl, python, \
ruby, cmake and r. \
 \
Modules are useful in managing different versions of applications. Modules can \
also be bundled into metamodules that will load an entire suite of different \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "4.8.0"

RPM_NAME = "Modules-doc-4.8.0-1.7.noarch.rpm"
RPM_HASH = "223461c252dacf6cfd5dc3374e7b5978d71b925bd4b5e4d3df3f7fca2f0b8718cbc413e115f78ce0e994ca3cc7c17bc56c192e3e90e26bf7d4fb6a8ace04222a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Modules-doc"

RDEPENDS:${PN} += ""

inherit rpm
