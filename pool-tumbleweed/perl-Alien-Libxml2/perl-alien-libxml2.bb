SUMMARY = "Install the C libxml2 library on your system"
DESCRIPTION = "This module provides 'libxml2' for other modules to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-Alien-Libxml2-0.19-1.4.aarch64.rpm"
RPM_HASH = "cc904fedb35a86ed69ffcfa8bc5d6306ad0721f9ea01e20e94b43a3d80bf1c96140f14e5fd0e976ba713fded51abaf5d1ae93ebf6f4d0d30500765ddfa82d230"

RPROVIDES:${PN} += "perl-Alien--Libxml2 \
perl-Alien--Libxml2--Install--Files \
perl-Alien-Libxml2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Alien--Base"

inherit rpm
