SUMMARY = "Haskell resolv profiling library"
DESCRIPTION = "This package provides the Haskell resolv profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-prof-0.1.2.0-10.6.aarch64.rpm"
RPM_HASH = "bed7925e14213e82a706f5bc2894b9adaf622084980b8bb8c139ab5d0c83bd0e3d401953546b64593efcb412e043ee724c3f965bd0ab92a2c61bdb90b551f439"

RPROVIDES:${PN} += "ghc-prof-resolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr \
ghc-resolv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-resolv-devel"

inherit rpm
