SUMMARY = "Haskell digest library development files"
DESCRIPTION = "This package provides the Haskell digest library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-devel-0.0.1.7-1.8.aarch64.rpm"
RPM_HASH = "8c96cf55a8870b1ef1442172a57c5c11c7b992cf2721b6f3fcb27cf96f3e3758e6e6345b6624cc3c452e1f571069141b56f9534f9b8f5430ff7c6af1f595cada"

RPROVIDES:${PN} += "ghc-devel-digest-0.0.1.7-x22LVSWrXSB7L6QfE4JoE \
ghc-digest-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-digest \
pkgconfig \
pkgconfig-zlib"

inherit rpm
