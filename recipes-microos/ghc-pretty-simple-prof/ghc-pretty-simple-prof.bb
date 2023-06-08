SUMMARY = "Haskell pretty-simple profiling library"
DESCRIPTION = "This package provides the Haskell pretty-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-prof-4.1.2.0-1.3.aarch64.rpm"
RPM_HASH = "d4662859bfea2cf83915ca6444e7b5da8bca094a230258b64e446fa426cf2b6febadb73ad2009892954385d5e6ab4bf8ca78e1f3236276f8625d6f01243f73aa"

RPROVIDES:${PN} += "ghc-pretty-simple-prof ghc-pretty-simple-prof(aarch-64) ghc-prof(pretty-simple-4.1.2.0-LfjX2FlO3KCJ7V5IZrf6zY)"
RDEPENDS:${PN} += "ghc-pretty-simple-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(mtl-2.2.2) ghc-prof(prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2) ghc-prof(prettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2)"

inherit rpm
