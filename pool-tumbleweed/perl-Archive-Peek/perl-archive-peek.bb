SUMMARY = "Peek into archives without extracting them"
DESCRIPTION = "This module lets you peek into archives without extracting them. It \
currently supports tar files and zip files. To support Bzip2- compressed \
files, you should install IO::Uncompress::Bunzip2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.37"

RPM_NAME = "perl-Archive-Peek-0.37-1.9.noarch.rpm"
RPM_HASH = "f56352cae4ff22168a63562c3d8bc2c29071da0e23d8c1ea78b2d932a489cdd88dbcb65c0ff407fa53fb13cd82a64417ebbac1aa75f4ce148e5b68d66fc00e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Peek \
perl-Archive--Peek--Tar \
perl-Archive--Peek--Zip \
perl-Archive-Peek"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-Moo \
perl-Types--Path--Tiny"

inherit rpm
