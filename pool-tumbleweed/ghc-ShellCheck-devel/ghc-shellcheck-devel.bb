SUMMARY = "Haskell ShellCheck library development files"
DESCRIPTION = "This package provides the Haskell ShellCheck library development files."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-devel-0.9.0-2.6.aarch64.rpm"
RPM_HASH = "274f8bff196ab9749bf8023422eb7d3a542fc9016a75771f8ef07ef0a091deae9ef92d4f4a406251dae39a2585c6ac79ec1b1fa22454b96efeafb83bf8bdf97e"

RPROVIDES:${PN} += "ghc-ShellCheck-devel \
ghc-devel-ShellCheck-0.9.0-LWMFFJLMPa51QWRCVvm68p"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ShellCheck \
ghc-compiler \
ghc-devel-Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP \
ghc-devel-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-process-1.6.16.0 \
ghc-devel-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-devel-transformers-0.5.6.2"

inherit rpm
