SUMMARY = "Haskell digest profiling library"
DESCRIPTION = "This package provides the Haskell digest profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-prof-0.0.1.7-1.3.aarch64.rpm"
RPM_HASH = "10f938651c09c48867237fb26c2be022d1612738928d6344b2fcfddc20baf24197f33de866da7b02eca8fb75723e2e8c7beea6cbb964fa1b55d895f42d884e48"

RPROVIDES:${PN} += "ghc-digest-prof \
ghc-prof-digest-0.0.1.7-CCCN8814sFy3HuiyT8t94G"

RDEPENDS:${PN} += "ghc-digest-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
