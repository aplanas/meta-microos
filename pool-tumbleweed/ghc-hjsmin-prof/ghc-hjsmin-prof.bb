SUMMARY = "Haskell hjsmin profiling library"
DESCRIPTION = "This package provides the Haskell hjsmin profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-prof-0.2.1-1.8.aarch64.rpm"
RPM_HASH = "35d217a33d0e98dc2e87da20631d5230a568df9d2512a68275107375635ba3762682697527c00f2a8a33f5acbfd079a9eca556cba2e96452bf96fbe6bbc322fa"

RPROVIDES:${PN} += "ghc-hjsmin-prof \
ghc-prof-hjsmin-0.2.1-5GDclcDeF3LDFr0332m90w"

RDEPENDS:${PN} += "ghc-hjsmin-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-language-javascript-0.7.1.0-5tkeoDchqnObRztPRYxz4 \
ghc-prof-text-2.0.2"

inherit rpm
