SUMMARY = "Haskell split library development files"
DESCRIPTION = "This package provides the Haskell split library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-devel-0.2.3.5-2.2.aarch64.rpm"
RPM_HASH = "f66f8161e07af06c9df0fd400cbc970f91390e204d8566564e06bd23ae2bd94dc6ed4cbcf2f31afa8b460a2be1635bd231a92fabc89c4165eeee16df9a9ffbe3"

RPROVIDES:${PN} += "ghc-devel(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) \
ghc-split-devel \
ghc-split-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-split"

inherit rpm
