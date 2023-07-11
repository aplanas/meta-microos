SUMMARY = "Dump Symbol Names or the Symbol Table"
DESCRIPTION = "This little package serves to access the symbol table of perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.18"

RPM_NAME = "perl-Devel-Symdump-2.18-1.24.noarch.rpm"
RPM_HASH = "abc6f6b550c9d1373252db5ff8506e30d6a6e10dbc978b3428d58ae196b31e857c2f2cc8cd98f414577af83bd49f3699c0b75b751745eabf140c594c3beda039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Symdump \
perl-Devel--Symdump--Export \
perl-Devel-Symdump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Compress--Zlib"

inherit rpm
