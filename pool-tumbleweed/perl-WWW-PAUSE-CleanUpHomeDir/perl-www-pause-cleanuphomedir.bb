SUMMARY = "the module to clean up old dists from your PAUSE home directory"
DESCRIPTION = "The module provides means to clean up your PAUSE home directory from old \
distributions with ability to undelete files if you so prefer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.001002"

RPM_NAME = "perl-WWW-PAUSE-CleanUpHomeDir-1.001002-1.25.noarch.rpm"
RPM_HASH = "bb021055646b7d9ce8324c30709cddcc238775dee2be491695c83d7278e0f09dc384eebcdb24163f90068f3c24ef1858cab8e84b6aa1f262a3c449599d843db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--PAUSE--CleanUpHomeDir \
perl-WWW-PAUSE-CleanUpHomeDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Grouped \
perl-Devel--TakeHashArgs \
perl-HTML--TokeParser--Simple \
perl-Sort--Versions \
perl-URI \
perl-WWW--Mechanize"

inherit rpm
