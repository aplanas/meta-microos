SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-vim-plugins-15.0.7-3.1.noarch.rpm"
RPM_HASH = "723d863799c27fc3e77ae662317a09a7de5b81f79fc2cb208942365e60c2e650c7ab13c8c0c0ac083de7d6ade06788fee642baac30e034d7f056ac9b171bf43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm15-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
