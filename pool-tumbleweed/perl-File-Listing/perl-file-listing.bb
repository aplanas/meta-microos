SUMMARY = "Parse directory listing"
DESCRIPTION = "This module exports a single function called 'parse_dir', which can be used \
to parse directory listings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.160.0"

RPM_NAME = "perl-File-Listing-6.160.0-1.1.noarch.rpm"
RPM_HASH = "eb382d50f4d5569602f0a3f6036295422ba21718dd6583c760e39d2ea20065bbe53b0e30d4c06407105d452796d1dbebccfd3d68b33e7c23a7d047c44e9a8e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Listing \
perl-File-Listing"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Date"

inherit rpm
