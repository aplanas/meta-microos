SUMMARY = "Haskell ShellCheck library development files"
DESCRIPTION = "This package provides the Haskell ShellCheck library development files."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-devel-0.9.0-2.7.aarch64.rpm"
RPM_HASH = "0a9ae6d6b2d6ca280d7f20412e65da6287739385abadb3cfe8709c8a822c11d7cbe200b5648b9304a578a2e91110be2e5acfa2581ec2ae7e90308e0bbb1e3a6a"

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
