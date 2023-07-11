SUMMARY = "perl module Crypt::SmbHash"
DESCRIPTION = "This module provides functions to generate LM/NT hashes as used by \
Samba"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "perl-Crypt-SmbHash-0.12-159.16.noarch.rpm"
RPM_HASH = "2eeaea59c9430223d4636922ccda7c3772089d131a7d104225cd7c58fc3eb894e76727788fec3eed2f317555a1ec7de6401d05c3b4fb5045ae90ba4452167dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SmbHash \
perl-Crypt-SmbHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest-MD4"

inherit rpm
