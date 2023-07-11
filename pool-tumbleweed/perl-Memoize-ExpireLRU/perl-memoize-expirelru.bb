SUMMARY = "Expiry plug-in for Memoize that adds LRU cache expiration"
DESCRIPTION = "For the theory of Memoization, please see the Memoize module documentation. \
This module implements an expiry policy for Memoize that follows LRU \
semantics, that is, the last n results, where n is specified as the \
argument to the 'CACHESIZE' parameter, will be cached."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.56"

RPM_NAME = "perl-Memoize-ExpireLRU-0.56-1.24.noarch.rpm"
RPM_HASH = "e17fc421df5f4dc2acd2919fd0ae62e545084412c40f9b76c42aefb8d8dbb42a38dd6ab52ac6b073aab6141baec3626eb228a184daf73a57cefbac7f319bf7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Memoize--ExpireLRU \
perl-Memoize-ExpireLRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
