SUMMARY = "Haskell SafeSemaphore library development files"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-devel-0.10.1-5.8.aarch64.rpm"
RPM_HASH = "f0e1aefba2ee58c4638792017f523788f4029e4a719feac7f01bc6cc22b4f9856a3092243cb72f912c548e1e8f49350f648485aae570325b1948f59a2768781d"

RPROVIDES:${PN} += "ghc-SafeSemaphore-devel \
ghc-devel-SafeSemaphore-0.10.1-8vfV4kQtVdq7fGz6bQJt9f"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-SafeSemaphore \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-stm-2.5.1.0"

inherit rpm
