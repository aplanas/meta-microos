SUMMARY = "Haskell pandoc-lua-engine profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "ghc-pandoc-lua-engine-prof-0.2-1.3.aarch64.rpm"
RPM_HASH = "cadef4af4e8722001e6fc365e4853168512c00eefad1e81d746b47432a08284d7bfc05dabf88d77b09c690e004e6747514902a20c0156bce0e0fbbef8ca04005"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-prof \
ghc-prof-pandoc-lua-engine-0.2-gHKByFrhtS8PSSuk3TZxt"

RDEPENDS:${PN} += "ghc-pandoc-lua-engine-devel \
ghc-prof-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW \
ghc-prof-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-citeproc-0.8.1-1D0nfQHnF7b6sejYb0d6Zi \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-doctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-2.3.0-1soYqkTydt2HAPmAXqHREY \
ghc-prof-hslua-module-doclayout-1.1.0-H1N0AwnXIkUJX0H1lSxUWS \
ghc-prof-hslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD \
ghc-prof-hslua-module-system-1.1.0.1-7243M7wFNHXL9pjhXYmDQK \
ghc-prof-hslua-module-text-1.1.0.1-EvPw7u7E7fn9ZAp58nb6qh \
ghc-prof-hslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg \
ghc-prof-hslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx \
ghc-prof-hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1 \
ghc-prof-lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-3.1.2-4COa82weJXB97OkqjDlb3I \
ghc-prof-pandoc-lua-marshal-0.2.2-2fE4OFaoKDIH7Xx6aGVXCP \
ghc-prof-pandoc-types-1.23-EFziwPO22I72D2SxHphq63 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
