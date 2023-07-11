SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-vim-plugins-13.0.1-10.1.noarch.rpm"
RPM_HASH = "e3dffd7c61b0bc18074a9eb0da800efd8c57dbafe76d0928f5aec5f2b803f071b42c2a6b86dc8632dc31dfb320f5b5aec3e0f3a3d1a20aa34a772273f4adfa32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm13-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
