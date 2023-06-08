SUMMARY = "Haskell library documentation meta package"
DESCRIPTION = "Installing this package causes ghc-*-doc packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-doc-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "ee83ba46db5ecbe1e8af450b06f419f948a2986cf8cd66254172251036d4585f08ccbe32d0c5b847b2e6a322983f3760ca29efa614075c1bbce91ba4208d6227"

RPROVIDES:${PN} += "ghc-doc ghc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
