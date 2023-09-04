SUMMARY = "Find and read perl modules like perl does"
DESCRIPTION = "This module finds modules in '@INC' using the same algorithm perl does. \
From that, it will give you the source content of a module, the file name \
(where available), and how it was found. Searches (and content) are based \
on the same internal rules that perl uses for _require|perlfunc/require_ \
and _do|perlfunc/do_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003003"

RPM_NAME = "perl-Module-Reader-0.003003-2.1.noarch.rpm"
RPM_HASH = "32e08570babb3f3d298a7ce1e7c12d4db96e1974460cc89b836cdcf2abd4b0bb8a3f1ce88dc2dc54595cb21889f622bb07ae45c7e12424b6b2ac414a7a1ade4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Reader \
perl-Module--Reader--File \
perl-Module-Reader"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
