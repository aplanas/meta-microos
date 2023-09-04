SUMMARY = "Expiry plug-in for Memoize that adds LRU cache expiration"
DESCRIPTION = "For the theory of Memoization, please see the Memoize module documentation. \
This module implements an expiry policy for Memoize that follows LRU \
semantics, that is, the last n results, where n is specified as the \
argument to the 'CACHESIZE' parameter, will be cached."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.56"

RPM_NAME = "perl-Memoize-ExpireLRU-0.56-1.25.noarch.rpm"
RPM_HASH = "ba3a10bd9597114836091ff81d1f97d096ec33737858efc84e76c993ad4c11a5a4bdf587fa8115ddda1db8fd9cae2b7b90b8418c76889f6552c784bd8e742994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Memoize--ExpireLRU \
perl-Memoize-ExpireLRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
