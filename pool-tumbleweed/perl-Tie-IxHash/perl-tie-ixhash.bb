SUMMARY = "ordered associative arrays for Perl"
DESCRIPTION = "This Perl module implements Perl hashes that preserve the order in which \
the hash elements were added. The order is not affected when values \
corresponding to existing keys in the IxHash are changed. The elements can \
also be set to any arbitrary supplied order. The familiar perl array \
operations can also be performed on the IxHash."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.23"

RPM_NAME = "perl-Tie-IxHash-1.23-5.26.noarch.rpm"
RPM_HASH = "1a4bb9e2dcd4cc7340eccf50607843a16c49350c9a1c0387db87495697a11e7881bf34c78c977a6940c2405c0bd244bf3255a470990d9fa152437fa8c9d31cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--IxHash \
perl-Tie-IxHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
