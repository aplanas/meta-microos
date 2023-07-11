SUMMARY = "Simple, Fast Implementation of Lru Cache in Pure Perl"
DESCRIPTION = "Cache::LRU is a simple, fast implementation of an in-memory LRU cache in \
pure perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Cache-LRU-0.04-2.21.noarch.rpm"
RPM_HASH = "5d0ebb654dc3f3dee693ebb4062e95b8621e66b031e9923f36d6de6dba536dbc22f4378ea40f772bfe74af826cf0de16e2c3cc3ffda918c6b26fc450f4a1394d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--LRU \
perl-Cache-LRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
