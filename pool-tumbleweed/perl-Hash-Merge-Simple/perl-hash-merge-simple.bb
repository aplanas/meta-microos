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

RPM_NAME = "perl-Hash-Merge-Simple-0.051-9.28.noarch.rpm"
RPM_HASH = "4a2686c1d1dd8128aa81068e4b610805933847d9a4bfb0ccb12e3128e56caa41d1e70736ad7864414a29cab9387c918a6b8d1f51156861a948d18acab152876e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Merge--Simple \
perl-Hash-Merge-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Clone"

inherit rpm
