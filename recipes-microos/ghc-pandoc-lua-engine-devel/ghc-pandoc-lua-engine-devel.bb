SUMMARY = "Haskell pandoc-lua-engine library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "ghc-pandoc-lua-engine-devel-0.2-1.3.aarch64.rpm"
RPM_HASH = "9372ae74b22732f2096d5e4c18f3927eab2a204876d2cf404fdbc6629a0eb24993c880839cc2859defc66a0f2e282ec0755d03969aa4828bffcc630ea3ffc4b8"

RPROVIDES:${PN} += "ghc-devel(pandoc-lua-engine-0.2-gHKByFrhtS8PSSuk3TZxt) \
ghc-pandoc-lua-engine-devel \
ghc-pandoc-lua-engine-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW) \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(citeproc-0.8.1-1D0nfQHnF7b6sejYb0d6Zi) \
ghc-devel(containers-0.6.7) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0) \
ghc-devel(doctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(hslua-2.3.0-1soYqkTydt2HAPmAXqHREY) \
ghc-devel(hslua-module-doclayout-1.1.0-H1N0AwnXIkUJX0H1lSxUWS) \
ghc-devel(hslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD) \
ghc-devel(hslua-module-system-1.1.0.1-7243M7wFNHXL9pjhXYmDQK) \
ghc-devel(hslua-module-text-1.1.0.1-EvPw7u7E7fn9ZAp58nb6qh) \
ghc-devel(hslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg) \
ghc-devel(hslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx) \
ghc-devel(hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1) \
ghc-devel(lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9) \
ghc-devel(mtl-2.2.2) \
ghc-devel(pandoc-3.1.2-4COa82weJXB97OkqjDlb3I) \
ghc-devel(pandoc-lua-marshal-0.2.2-2fE4OFaoKDIH7Xx6aGVXCP) \
ghc-devel(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(text-2.0.2) \
ghc-pandoc-lua-engine"

inherit rpm
