SUMMARY = "ordered associative arrays for Perl"
DESCRIPTION = "This Perl module implements Perl hashes that preserve the order in which \
the hash elements were added. The order is not affected when values \
corresponding to existing keys in the IxHash are changed. The elements can \
also be set to any arbitrary supplied order. The familiar perl array \
operations can also be performed on the IxHash."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.23"

RPM_NAME = "perl-Tie-IxHash-1.23-5.25.noarch.rpm"
RPM_HASH = "64dd441f6dacc98c215a5e23ddf974623afd05cd60da83c06ab00eb3f9afac5323c3a4cb2be0e7d656275b638e302647e22cbcd36403e8064a781abd4b34a6f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--IxHash \
perl-Tie-IxHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
