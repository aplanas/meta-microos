SUMMARY = "Haskell language-docker profiling library"
DESCRIPTION = "This package provides the Haskell language-docker profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-prof-11.0.0-1.3.aarch64.rpm"
RPM_HASH = "5ad63d49bd3bf7b33ce6b3ed848994de6ccf9490d34937dfd3271f20cf43b43af6b21aa2807414871f7e5088beea93a22482e40dd3721ee643fedaaa61763604"

RPROVIDES:${PN} += "ghc-language-docker-prof ghc-language-docker-prof(aarch-64) ghc-prof(language-docker-11.0.0-LOoHldD1EPH8sK8xHuKTA9)"
RDEPENDS:${PN} += "ghc-language-docker-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) ghc-prof(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) ghc-prof(prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2) ghc-prof(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) ghc-prof(text-2.0.2) ghc-prof(time-1.12.2)"

inherit rpm
