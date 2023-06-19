SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting. \
 \
This package is a dummy package that depends on the version of \
llvm-vim-plugins that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-vim-plugins-16.0.4-1.1.noarch.rpm"
RPM_HASH = "afea12848cfc0f23fd080ec3624278e52be3a5581adeed1a2c5c53fff2a612a195fd886ca7bd24fd9fbd2e93c0a439d4915b910e228e5fb3ba0009258eed6bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-vim-plugins"

RDEPENDS:${PN} += "llvm16-vim-plugins"

inherit rpm
