SUMMARY = "Haskell alsa-mixer library development files"
DESCRIPTION = "This package provides the Haskell alsa-mixer library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-devel-0.3.0-4.2.aarch64.rpm"
RPM_HASH = "ab6cd7a808df09c39aea26728ef2e692d5249ac20eaa102ef356d5f3326894738fdb5feb5dc9824da787635adc41baab083a7ca6da70b791fa269ddaf6f8f5f7"

RPROVIDES:${PN} += "ghc-alsa-mixer-devel \
ghc-alsa-mixer-devel(aarch-64) \
ghc-devel(alsa-mixer-0.3.0-Ff4FVP5Sg8l3sx20Z8BrVj)"
RDEPENDS:${PN} += "/bin/sh \
alsa-devel \
ghc-alsa-mixer \
ghc-compiler \
ghc-devel(alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg) \
ghc-devel(base-4.17.1.0) \
ghc-devel(unix-2.7.3)"

inherit rpm
