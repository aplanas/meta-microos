SUMMARY = "Haskell vty library development files"
DESCRIPTION = "This package provides the Haskell vty library development files."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-devel-5.38-2.4.aarch64.rpm"
RPM_HASH = "88668a002f3e58c089351a79daa57040cdfd752c1e75e1e48d85898953cc684a6bb73905d4dae6781d0492fd45fe7697201e43185c5292fe1b55b991f50ae9b3"

RPROVIDES:${PN} += "ghc-devel(vty-5.38-E9MiSc6Hkm5LKREDrOQCil) \
ghc-vty-devel \
ghc-vty-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) \
ghc-devel(microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV) \
ghc-devel(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(terminfo-0.4.1.5) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-vty"

inherit rpm
