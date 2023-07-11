SUMMARY = "Parse directory listing"
DESCRIPTION = "This module exports a single function called 'parse_dir', which can be used \
to parse directory listings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.15"

RPM_NAME = "perl-File-Listing-6.15-1.7.noarch.rpm"
RPM_HASH = "c33a75166d11d3c3d1ade81ab659e85b56d3aca6835265d737f2c303a85b98a1bfb907d0128e127e01f09dd713e781698e5b85896bd3a3093b1768f81a39227f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Listing \
perl-File--Listing--apache \
perl-File--Listing--dosftp \
perl-File--Listing--netware \
perl-File--Listing--unix \
perl-File--Listing--vms \
perl-File-Listing"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Date"

inherit rpm
