SUMMARY = "Haskell colourista library development files"
DESCRIPTION = "This package provides the Haskell colourista library development files."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-devel-0.1.0.2-1.6.aarch64.rpm"
RPM_HASH = "f51fdf02c2503a85bc0d23736f9849d9cab44fdd78722710b204f3355d0af6ce249764a89835deb3387ac8c9af31b70111fde7ae7bbf4b4f7fb18776cf864a36"

RPROVIDES:${PN} += "ghc-colourista-devel \
ghc-devel-colourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-colourista \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2"

inherit rpm
