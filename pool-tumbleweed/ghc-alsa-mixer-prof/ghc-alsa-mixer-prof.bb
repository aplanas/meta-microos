SUMMARY = "Haskell alsa-mixer profiling library"
DESCRIPTION = "This package provides the Haskell alsa-mixer profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-prof-0.3.0-4.3.aarch64.rpm"
RPM_HASH = "b0771c9df5d9a454e0dde0adde68b01c476396ed04753774e32741215e1522cdae702a5bd60f69364108443798debe623b159680756e0921ab444417aa686474"

RPROVIDES:${PN} += "ghc-alsa-mixer-prof \
ghc-prof-alsa-mixer-0.3.0-7vTOWVmX7tmF7GIGTcxaSH"

RDEPENDS:${PN} += "ghc-alsa-mixer-devel \
ghc-prof-alsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy \
ghc-prof-base-4.17.2.0 \
ghc-prof-unix-2.7.3"

inherit rpm
