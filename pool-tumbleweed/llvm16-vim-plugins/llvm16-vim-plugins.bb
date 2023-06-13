SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-vim-plugins-16.0.4-1.1.noarch.rpm"
RPM_HASH = "9813d88948533fe72e8ef6c873bfd99b648c340d182618a712b52229fe221a0f8fcb58964bb83a260b0859c0e20895917846969177d17a894bbcd265fdffd7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm16-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
