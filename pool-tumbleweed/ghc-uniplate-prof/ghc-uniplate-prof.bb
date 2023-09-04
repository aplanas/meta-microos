SUMMARY = "Haskell uniplate profiling library"
DESCRIPTION = "This package provides the Haskell uniplate profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-prof-1.6.13-4.10.aarch64.rpm"
RPM_HASH = "925e492c84040485aca6d9145b3987ca22d2ee186d14d5f675d0f52a166caab6f0db080c3906ad10c9cec0093c7e7b079a72f65068ce4c16c426200b7f32010c"

RPROVIDES:${PN} += "ghc-prof-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-uniplate-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-uniplate-devel"

inherit rpm
