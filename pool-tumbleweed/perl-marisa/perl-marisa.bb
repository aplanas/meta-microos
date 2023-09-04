SUMMARY = "Perl bindings for marisa"
DESCRIPTION = "Perl bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "perl-marisa-0.2.6-1.24.aarch64.rpm"
RPM_HASH = "59bab06d340a12a01103b4ab7b152a231dae355eed9d1ea50fde2b4256294e44d1c6555a0754852696a89a7ba22fcad63c36b4c0062f4100978f2a75d124dca0"

RPROVIDES:${PN} += "perl-marisa \
perl-marisa--Agent \
perl-marisa--Key \
perl-marisa--Keyset \
perl-marisa--Query \
perl-marisa--Trie \
perl-marisac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
marisa \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
