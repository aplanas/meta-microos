SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-vim-plugins-14.0.6-10.1.noarch.rpm"
RPM_HASH = "54b26ff9b78dd848118e8583c04264f1972945eef3298ccb1377421a8dd72dc388c1d8c768da60c14a6f81884269be716ceede62de2bacbd0b7119574dc01770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm14-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
