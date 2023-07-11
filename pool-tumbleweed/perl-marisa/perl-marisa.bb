SUMMARY = "Perl bindings for marisa"
DESCRIPTION = "Perl bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "perl-marisa-0.2.6-1.23.aarch64.rpm"
RPM_HASH = "a6f46ff39ae65fcb59739dcfac2f00c43940bdae727edbf709be3806af25eb4f334d7d9af1ee3915d4b5c3250f1bdf01b399bb3fbef4235b3d8f28460aa3cd9a"

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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
