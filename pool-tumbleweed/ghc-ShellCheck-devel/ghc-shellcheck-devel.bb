SUMMARY = "Haskell ShellCheck library development files"
DESCRIPTION = "This package provides the Haskell ShellCheck library development files."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-devel-0.9.0-2.3.aarch64.rpm"
RPM_HASH = "54cbed2442bcbe5063cc3b8758683c4df629d6eba6eea06778452cf4465481292678ed9382c3d09fcfeaf10fdf4b4ec57646ef16825f966a316c9b1c269eeacf"

RPROVIDES:${PN} += "ghc-ShellCheck-devel \
ghc-ShellCheck-devel(aarch-64) \
ghc-devel(ShellCheck-0.9.0-DdkSsqjqnem8sl1ZfVxG9G)"

RDEPENDS:${PN} += "/bin/sh \
ghc-ShellCheck \
ghc-compiler \
ghc-devel(Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP) \
ghc-devel(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6) \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(process-1.6.16.0) \
ghc-devel(regex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU) \
ghc-devel(transformers-0.5.6.2)"

inherit rpm
