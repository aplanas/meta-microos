SUMMARY = "Find memory cycles in objects"
DESCRIPTION = "This is a simple developer's tool for finding circular references in \
objects and other types of references. Because of Perl's reference-count \
based memory management, circular references will cause memory leaks."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.12"

RPM_NAME = "perl-Devel-Cycle-1.12-1.28.noarch.rpm"
RPM_HASH = "38460ece790636b163e213aa56b3e67f30812973a86c059f8785200bd315bcdf058bb513e1bbfbd87673dc867d6f770aeb4e4e098e8b056e666425a37f1f7b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Cycle \
perl-Devel-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
