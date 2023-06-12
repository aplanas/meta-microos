SUMMARY = "ordered associative arrays for Perl"
DESCRIPTION = "This Perl module implements Perl hashes that preserve the order in which \
the hash elements were added. The order is not affected when values \
corresponding to existing keys in the IxHash are changed. The elements can \
also be set to any arbitrary supplied order. The familiar perl array \
operations can also be performed on the IxHash."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.23"

RPM_NAME = "perl-Tie-IxHash-1.23-5.24.noarch.rpm"
RPM_HASH = "6eba9027b09405bd8a7dc4c39834cfdbdd2a28104e51151130f8745ea8d736520a6ee5b8258ced1a158401459c2c5343925b75835e7db1d2c87f8654f5063aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Tie::IxHash) \
perl-Tie-IxHash"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
