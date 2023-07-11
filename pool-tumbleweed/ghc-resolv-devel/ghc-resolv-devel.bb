SUMMARY = "Haskell resolv library development files"
DESCRIPTION = "This package provides the Haskell resolv library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-devel-0.1.2.0-10.6.aarch64.rpm"
RPM_HASH = "dd269dae93f6fbd2b0c1c55bdd214caca41a1c24214f9bb07a3b5111f5c76c800ca140a04238dc68a056a7c349218492c8b1aefafdc15b6ddca144f8a05d437e"

RPROVIDES:${PN} += "ghc-devel-resolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr \
ghc-resolv-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-resolv"

inherit rpm
