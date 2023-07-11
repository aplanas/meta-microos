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

RPM_NAME = "perl-MooX-Attribute-ENV-0.04-1.9.noarch.rpm"
RPM_HASH = "26be81d79206d5557bc9e97038861402685c55064050298f7a6375bbb234a35c6db1b6a1d32620b6f14eac062d9a702789ed119af30603a88041d930ccb2160f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Attribute--ENV \
perl-MooX-Attribute-ENV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moo"

inherit rpm
