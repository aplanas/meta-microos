SUMMARY = "Haskell pretty-simple library development files"
DESCRIPTION = "This package provides the Haskell pretty-simple library development files."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-devel-4.1.2.0-1.3.aarch64.rpm"
RPM_HASH = "6b50ad8c89d86c98af9a064bac8ce0cbb0f693571987295de675406563b91ad409e3b986726a1a34c3dcb12e994a2987e5267c736b90a994a5777ec6ba5420da"

RPROVIDES:${PN} += "ghc-devel(pretty-simple-4.1.2.0-LfjX2FlO3KCJ7V5IZrf6zY) \
ghc-pretty-simple-devel \
ghc-pretty-simple-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(mtl-2.2.2) \
ghc-devel(prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2) \
ghc-devel(prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-pretty-simple"

inherit rpm
