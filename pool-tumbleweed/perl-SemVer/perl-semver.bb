SUMMARY = "Use semantic version numbers"
DESCRIPTION = "Use semantic version numbers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-SemVer-0.10.0-1.2.noarch.rpm"
RPM_HASH = "b5ebf6560e61827dc9069d2248d8a8c272203dfc30486fa350c2c48c02792fe2c9262101253a56ffb18369975cef9c2fc8e33279b5161b7468061bc341d24726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SemVer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-version"

inherit rpm
