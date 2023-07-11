SUMMARY = "Merges arbitrarily deep hashes into a single hash"
DESCRIPTION = "Hash::Merge merges two arbitrarily deep hashes into a single hash. That is, \
at any level, it will add non-conflicting key-value pairs from one hash to \
the other, and follows a set of specific rules when there are key value \
conflicts (as outlined below). The hash is followed recursively, so that \
deeply nested hashes that are at the same level will be merged when the \
parent hashes are merged. *Please note that self-referencing hashes, or \
recursive references, are not handled well by this method.* \
 \
Values in hashes are considered to be either ARRAY references, HASH \
references, or otherwise are treated as SCALARs. By default, the data \
passed to the merge function will be cloned using the Clone module; \
however, if necessary, this behavior can be changed to use as many of the \
original values as possible. (See 'set_clone_behavior')."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.302"

RPM_NAME = "perl-Hash-Merge-0.302-1.14.noarch.rpm"
RPM_HASH = "d63429ec91a11b7e7f7f1a10358798a4c90c9d31d6bb8e3d5141b14a867f92eddc98ee538afcb9e70e1a5f99d61658b9a77a410955f26953fff3e2604be9c7da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Merge \
perl-Hash-Merge"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Clone--Choose"

inherit rpm
