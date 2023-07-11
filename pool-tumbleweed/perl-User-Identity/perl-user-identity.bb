SUMMARY = "Collect information about a user"
DESCRIPTION = "The 'User-Identity' distribution is created to maintain a set of \
informational objects which are related to one user. The 'User::Identity' \
module tries to be smart providing defaults, conversions and often required \
combinations. \
 \
The identities are not implementing any kind of storage, and can therefore \
be created by any simple or complex Perl program. This way, it is more \
flexible than an XML file to store the data. For instance, you can decide \
to store the data with Data::Dumper, Storable, DBI, AddressBook or \
whatever. Extension to simplify this task are still to be developed. \
 \
If you need more kinds of user information, then please contact the module \
author. \
 \
Extends 'DESCRIPTION' in User::Identity::Item."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-User-Identity-1.02-1.2.noarch.rpm"
RPM_HASH = "6d89e253cc027c852011c6d278b3bf8ee1f8f82aa614bc4fb420ffa74790a92be4913891277957abf812bef394c74b4998c123cfe0cd4d06e6b6845ce5705c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Identity \
perl-User--Identity \
perl-User--Identity--Archive \
perl-User--Identity--Archive--Plain \
perl-User--Identity--Collection \
perl-User--Identity--Collection--Emails \
perl-User--Identity--Collection--Locations \
perl-User--Identity--Collection--Systems \
perl-User--Identity--Collection--Users \
perl-User--Identity--Item \
perl-User--Identity--Location \
perl-User--Identity--System \
perl-User-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Hash--Ordered"

inherit rpm
