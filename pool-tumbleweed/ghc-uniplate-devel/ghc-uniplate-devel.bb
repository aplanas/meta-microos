SUMMARY = "Haskell uniplate library development files"
DESCRIPTION = "This package provides the Haskell uniplate library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-devel-1.6.13-4.10.aarch64.rpm"
RPM_HASH = "54dd79e8463c85a632175a0cb8db224715f417b0c123fd5efdc4dac64fe74b24ef08d426ebccb109e47ef137fb51a612624dbc970375a82809c8bb6a0c86ac3b"

RPROVIDES:${PN} += "ghc-devel-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-uniplate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-uniplate"

inherit rpm
