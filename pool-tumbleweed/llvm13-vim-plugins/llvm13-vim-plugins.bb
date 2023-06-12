SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-vim-plugins-13.0.1-9.1.noarch.rpm"
RPM_HASH = "54da3978b7dea01276df8e06249e0c205caef83ce712ae45765460117685c5976db912c432bda11b98d07cce79e38734649975b63c590122e0ae58446d019ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm13-vim-plugins \
vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
