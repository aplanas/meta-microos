SUMMARY = "Haskell cookie profiling library"
DESCRIPTION = "This package provides the Haskell cookie profiling library."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-prof-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "42d93de9178b5d065149d468a66ea3359f95ed03cbebf9acc1d6b629935004ba084eaab6beac1767b2f270c1ffecdbc8bb5d844e5f904866a60ae4bf15e5b384"

RPROVIDES:${PN} += "ghc-cookie-prof \
ghc-prof-cookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L"

RDEPENDS:${PN} += "ghc-cookie-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2"

inherit rpm
