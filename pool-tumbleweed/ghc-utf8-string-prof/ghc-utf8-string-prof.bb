SUMMARY = "Haskell utf8-string profiling library"
DESCRIPTION = "This package provides the Haskell utf8-string profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-prof-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "27964915971d679f52110f850a8cf7fc5a9bb44473ab0499bd1b6bc36e746f6ac14a07b7c7c043420c9f28577868e018864867e6ce6841b7a2ac1f691dc0f26a"

RPROVIDES:${PN} += "ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-utf8-string-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-utf8-string-devel"

inherit rpm
