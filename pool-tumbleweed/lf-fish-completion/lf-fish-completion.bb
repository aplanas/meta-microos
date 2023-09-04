SUMMARY = "Fish Completion for lf"
DESCRIPTION = "Fish command-line completion support for lf."
LICENSE = "MIT"

PV = "30+dd82949"

RPM_NAME = "lf-fish-completion-30+dd82949-1.1.noarch.rpm"
RPM_HASH = "cc7f8fd07883450a33325fca2e03ea6143ce05e7f718e0e121a4b193befc876d60e68fac03490dc3d3a14b0d5a44432d435ead8876814dc1834692155aa8ffcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
