SUMMARY = "Allow Moo attributes to get their values from %ENV"
DESCRIPTION = "This is a Moo extension. It allows other attributes for Moo/has. If any of \
these are given, then Moo/BUILDARGS is wrapped so that values for object \
attributes can, if not supplied in the normal construction process, come \
from the environment. \
 \
The environment will be searched for either the given case, or upper case, \
version of the names discussed below. \
 \
When a prefix is mentioned, it will be prepended to the mentioned name, \
with a '_' in between."
LICENSE = "Artistic-2.0"

PV = "0.04"

RPM_NAME = "perl-MooX-Attribute-ENV-0.04-1.10.noarch.rpm"
RPM_HASH = "66ad81cac31c08850e9aad3c22d0c67c87cb74a862ae6988088211cc89bb861f344b8a9c10ab0ae206b319b83a512c5f6e95f2141f90c12793c8fc1937b046bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Attribute--ENV \
perl-MooX-Attribute-ENV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo"

inherit rpm
