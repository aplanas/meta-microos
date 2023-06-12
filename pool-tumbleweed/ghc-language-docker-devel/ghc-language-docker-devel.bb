SUMMARY = "Haskell language-docker library development files"
DESCRIPTION = "This package provides the Haskell language-docker library development \
files."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-devel-11.0.0-1.3.aarch64.rpm"
RPM_HASH = "76fcbfff567c2ddfc029a7fe9753fec0ff7a1280e201c6b302a5128569ada0315032d6439c7a2cf4f33a519c08c8b395714b04ab1f476df3ab8b9b1a7b523ac0"

RPROVIDES:${PN} += "ghc-devel(language-docker-11.0.0-LOoHldD1EPH8sK8xHuKTA9) \
ghc-language-docker-devel \
ghc-language-docker-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-devel(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) \
ghc-devel(prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2) \
ghc-devel(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-language-docker"

inherit rpm
