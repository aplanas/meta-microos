SUMMARY = "Peek into archives without extracting them"
DESCRIPTION = "This module lets you peek into archives without extracting them. It \
currently supports tar files and zip files. To support Bzip2- compressed \
files, you should install IO::Uncompress::Bunzip2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.37"

RPM_NAME = "perl-Archive-Peek-0.37-1.8.noarch.rpm"
RPM_HASH = "6ef074c5527449abef17d7aa0195764e8d04c4791a6a055ea32d35214b61c28e68c4886dffd90035b147fa0a11e60e3777d3a2a10d1aabe7bf9ef9eec3d91ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Peek \
perl-Archive--Peek--Tar \
perl-Archive--Peek--Zip \
perl-Archive-Peek"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-Moo \
perl-Types--Path--Tiny"

inherit rpm
