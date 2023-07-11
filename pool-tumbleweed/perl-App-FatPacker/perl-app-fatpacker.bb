SUMMARY = "Pack Your Dependencies Onto Your Script File"
DESCRIPTION = "pack your dependencies onto your script file"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010008"

RPM_NAME = "perl-App-FatPacker-0.010008-1.16.noarch.rpm"
RPM_HASH = "3e099068615fbc8d268b38ee4617e9a6d0205f1c63bb0e0cb88e497797d7ef749d8cf26f7e7bf715eb49c1fa77772d2304dfbe0e804220a06f6c7bb35ccb82e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--FatPacker \
perl-App--FatPacker--Trace \
perl-App-FatPacker"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
