SUMMARY = "Haskell network-info profiling library"
DESCRIPTION = "This package provides the Haskell network-info profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-prof-0.2.1-2.4.aarch64.rpm"
RPM_HASH = "30ed1897cd0796f625d43140d550760e44238b50892fa076704a71c3a2d2780c690d5a9fd87b444cf090d65619b484d5f2ebe4358a15ba97b8bbe5ef9e23e3d4"

RPROVIDES:${PN} += "ghc-network-info-prof \
ghc-prof-network-info-0.2.1-EA7QwxKMOIgJxpSbEh9J66"

RDEPENDS:${PN} += "ghc-network-info-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
