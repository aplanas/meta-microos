SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-vim-plugins-12.0.1-12.1.noarch.rpm"
RPM_HASH = "0d1e606762d136a92e08dd7da82cc355859b5fdff07de11ae734e85181e5168f256ec7b845fd1382116b6074f8a0cd6dd083ee45052f909eaadd78a57a0db3f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm12-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
