SUMMARY = "Haskell connection library development files"
DESCRIPTION = "This package provides the Haskell connection library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-devel-0.3.1-8.3.aarch64.rpm"
RPM_HASH = "3671607a1a85f30e43f8a6918402aa7afbf288b87c354924fe65cbce779117ba5f5c8b415c12b2cf4a11d4300f048b395528661099307be29f78a59342d6dd53"

RPROVIDES:${PN} += "ghc-connection-devel \
ghc-devel-connection-0.3.1-HritGhbYIMl4OD06E3KY8G"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-connection \
ghc-devel-base-4.17.2.0 \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-socks-0.6.1-5RVEIbYAf8qJqchdUVHVHw \
ghc-devel-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-devel-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-devel-x509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY \
ghc-devel-x509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4"

inherit rpm
