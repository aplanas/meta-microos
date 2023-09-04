SUMMARY = "Peek into archives without extracting them"
DESCRIPTION = "This module lets you peek into archives without extracting them. It \
currently supports tar files and zip files. To support Bzip2- compressed \
files, you should install IO::Uncompress::Bunzip2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.37"

RPM_NAME = "perl-Archive-Peek-0.37-1.10.noarch.rpm"
RPM_HASH = "f167a44dea94b927aef928bc75f5fb5e70f9f4ce4595595b9dd7f6d49fa9d1137caa047879a9508e269be7df56b2e31ae3184fa8fbc6a387ccdc8e4920dba8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Peek \
perl-Archive--Peek--Tar \
perl-Archive--Peek--Zip \
perl-Archive-Peek"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-Moo \
perl-Types--Path--Tiny"

inherit rpm
