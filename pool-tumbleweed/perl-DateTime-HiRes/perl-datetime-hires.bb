SUMMARY = "Create DateTime objects with sub-second current time resolution"
DESCRIPTION = "This module enables you to generate DateTime objects that represent the \
current time with sub-second resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-DateTime-HiRes-0.04-1.2.noarch.rpm"
RPM_HASH = "965c9fb831e0176817712fefcf028961d0ad207e713c3d34dde7f6cbd914292ba01e462b3e2616a0bc1d84c0508d04e1b999a2743f6b8793dfac4ab375fd00c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--HiRes \
perl-DateTime-HiRes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime"

inherit rpm
