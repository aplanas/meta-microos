SUMMARY = "Recursively create a directory tree"
DESCRIPTION = "This module was extracted from several near-identical copies used in the \
tests of some of my CPAN distributions."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "perl-File-TreeCreate-0.0.1-1.10.noarch.rpm"
RPM_HASH = "63dd7d755bf4ae1da4a1e812c4c771a9cf295b83436c17d869090acbb39236b4543d1c8c915f63deba334f23a9cfc6909d714242b657ed98761e785cf03b8184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--TreeCreate \
perl-File-TreeCreate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-autodie"

inherit rpm
