SUMMARY = "Install the C libxml2 library on your system"
DESCRIPTION = "This module provides 'libxml2' for other modules to use."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-Alien-Libxml2-0.19-1.3.aarch64.rpm"
RPM_HASH = "3360e206a6a7fcb95f7db2bd540a4b71236d6bd485ad83cd0255b87c50a97681ed7f2801c734444d97e975db1618442d0fcc26aaba7ab8384ac604a3c0998966"

RPROVIDES:${PN} += "perl-Alien--Libxml2 \
perl-Alien--Libxml2--Install--Files \
perl-Alien-Libxml2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Alien--Base"

inherit rpm
