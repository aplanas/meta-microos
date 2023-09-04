SUMMARY = "Parse directory listing"
DESCRIPTION = "This module exports a single function called 'parse_dir', which can be used \
to parse directory listings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.160.0"

RPM_NAME = "perl-File-Listing-6.160.0-1.2.noarch.rpm"
RPM_HASH = "8bfe9777d75a2d114d3ca39c7e55212a1e12aa0e20101fa83c10419b5da7a1d5db639978a9fce15c3e18e212ae5d8e6ea2f8ad9be73d44af84707dab202c8b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Listing \
perl-File-Listing"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Date"

inherit rpm
