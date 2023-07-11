SUMMARY = "Recursively merge two or more hashes, simply"
DESCRIPTION = "Hash::Merge::Simple will recursively merge two or more hashes and return \
the result as a new hash reference. The merge function will descend and \
merge hashes that exist under the same node in both the left and right \
hash, but doesn't attempt to combine arrays, objects, scalars, or anything \
else. The rightmost hash also takes precedence, replacing whatever was in \
the left hash if a conflict occurs. \
 \
This code was pretty much taken straight from the Catalyst::Utils manpage, \
and modified to handle more than 2 hashes at the same time."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.051"

RPM_NAME = "perl-Hash-Merge-Simple-0.051-9.27.noarch.rpm"
RPM_HASH = "dd3f9875e499e747762cced7eaff045b21e566035e2f110f99508a2431874bbe7fac153e34fd28d25ead1c2ec1ad5b37c4f9cea1be8d80770ab2eccc2502ba38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Merge--Simple \
perl-Hash-Merge-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Clone"

inherit rpm
