SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "llvm16-vim-plugins-16.0.6-1.1.noarch.rpm"
RPM_HASH = "a9d5800449e272e0f75b9ed2c73a80fafde6ddd90ebafc342d5f8605bc4606dc3899634aa5b13ad7c07a3943ac88e47a3ed63c4ac492d0687ae2a114db07735f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm16-vim-plugins \
vim-plugin-llvm"

RDEPENDS:${PN} += ""

inherit rpm
