SUMMARY = "perl module Crypt::SmbHash"
DESCRIPTION = "This module provides functions to generate LM/NT hashes as used by \
Samba"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "perl-Crypt-SmbHash-0.12-159.17.noarch.rpm"
RPM_HASH = "19e5c65eb54b3664f84a87f460f317c08b92e076b3d8d033a081848342c10ac5c2236f5e8234e0a8f9639ee133516449c5725d0bbf4af2bef9b249019248151d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SmbHash \
perl-Crypt-SmbHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest-MD4"

inherit rpm
