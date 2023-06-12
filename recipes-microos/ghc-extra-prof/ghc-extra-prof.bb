SUMMARY = "Haskell extra profiling library"
DESCRIPTION = "This package provides the Haskell extra profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.13"

RPM_NAME = "ghc-extra-prof-1.7.13-1.2.aarch64.rpm"
RPM_HASH = "7d0ec616e1d800c332e4fef95e28df97bf48a6cdcf374e4b94b0c97b0ff68455d6e57085f513af0cbcb9edbffd10adb16a78389bc77bf173ec97eaff5c30819e"

RPROVIDES:${PN} += "ghc-extra-prof \
ghc-extra-prof(aarch-64) \
ghc-prof(extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4)"
RDEPENDS:${PN} += "ghc-extra-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(process-1.6.16.0) \
ghc-prof(time-1.12.2) \
ghc-prof(unix-2.7.3)"

inherit rpm
