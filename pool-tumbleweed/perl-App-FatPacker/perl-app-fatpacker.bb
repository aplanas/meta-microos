SUMMARY = "Pack Your Dependencies Onto Your Script File"
DESCRIPTION = "pack your dependencies onto your script file"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010008"

RPM_NAME = "perl-App-FatPacker-0.010008-1.15.noarch.rpm"
RPM_HASH = "97180490bdbe7460b72aa3bdf504034ea3e56950e514c6b43b5cf7d012c4b86f56925583670f6c0f65989028b6a9bbf998eb6ac8db2c65030bd72fa5d96755c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--FatPacker \
perl-App--FatPacker--Trace \
perl-App-FatPacker"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
