SUMMARY = "the module to clean up old dists from your PAUSE home directory"
DESCRIPTION = "The module provides means to clean up your PAUSE home directory from old \
distributions with ability to undelete files if you so prefer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.001002"

RPM_NAME = "perl-WWW-PAUSE-CleanUpHomeDir-1.001002-1.24.noarch.rpm"
RPM_HASH = "024da3466fffaae37a72cc673e90fde82a480c2b0a62137b0bfe7960689817cf02e78d4b76b5b94360ab66a0262ddac795e194f855e89cee95fd4c30855ec4bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--PAUSE--CleanUpHomeDir \
perl-WWW-PAUSE-CleanUpHomeDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Grouped \
perl-Devel--TakeHashArgs \
perl-HTML--TokeParser--Simple \
perl-Sort--Versions \
perl-URI \
perl-WWW--Mechanize"

inherit rpm
