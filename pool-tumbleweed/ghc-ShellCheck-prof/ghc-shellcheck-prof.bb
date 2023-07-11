SUMMARY = "Haskell ShellCheck profiling library"
DESCRIPTION = "This package provides the Haskell ShellCheck profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-prof-0.9.0-2.6.aarch64.rpm"
RPM_HASH = "fc444f122fdee9b32e390309d88bccb8ca2c0dd887140d06b7c4ec1a8b321daf7f55f2d005760e0d853c9178b5e25797740e330733c0dda09564e94b9575085e"

RPROVIDES:${PN} += "ghc-ShellCheck-prof \
ghc-prof-ShellCheck-0.9.0-LWMFFJLMPa51QWRCVvm68p"

RDEPENDS:${PN} += "ghc-ShellCheck-devel \
ghc-prof-Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP \
ghc-prof-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-process-1.6.16.0 \
ghc-prof-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-prof-transformers-0.5.6.2"

inherit rpm
