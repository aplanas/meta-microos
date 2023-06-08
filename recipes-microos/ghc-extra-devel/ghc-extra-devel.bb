SUMMARY = "Haskell extra library development files"
DESCRIPTION = "This package provides the Haskell extra library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.13"

RPM_NAME = "ghc-extra-devel-1.7.13-1.2.aarch64.rpm"
RPM_HASH = "86c4fa947fd1eadb6649c92393d3aa3fea34baa4b57d13135b45de539081fa68186d94dfe7fdc68a3cde84247e6e7bd8246af47bb5275cc97f592584d6f1e475"

RPROVIDES:${PN} += "ghc-devel(extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4) ghc-extra-devel ghc-extra-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(process-1.6.16.0) ghc-devel(time-1.12.2) ghc-devel(unix-2.7.3) ghc-extra"

inherit rpm
