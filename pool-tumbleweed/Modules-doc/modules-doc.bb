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

RPM_NAME = "Modules-doc-4.8.0-1.8.noarch.rpm"
RPM_HASH = "54a032da67ba0723e61d8d30c0c7f0b1743b9763f4b44ff124df03daffebdb32e4c5256207f8b31a9aa932f69b75636e023f9b11199a21281421ee68e50319e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Modules-doc"

RDEPENDS:${PN} += ""

inherit rpm
