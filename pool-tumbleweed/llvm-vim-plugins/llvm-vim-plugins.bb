SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting. \
 \
This package is a dummy package that depends on the version of \
llvm-vim-plugins that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "16.0.6"

RPM_NAME = "llvm-vim-plugins-16.0.6-1.1.noarch.rpm"
RPM_HASH = "3f1fdddb335a24ef214fb169c2901050428abcabc6afb1e128ba4bd0b004c9d2684a2ac11e536fa2cd24ecc3036a941d7533d403f0df816968b559127ae8b22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-vim-plugins"

RDEPENDS:${PN} += "llvm16-vim-plugins"

inherit rpm
