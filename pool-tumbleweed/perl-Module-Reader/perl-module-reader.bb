SUMMARY = "Find and read perl modules like perl does"
DESCRIPTION = "This module finds modules in '@INC' using the same algorithm perl does. \
From that, it will give you the source content of a module, the file name \
(where available), and how it was found. Searches (and content) are based \
on the same internal rules that perl uses for _require|perlfunc/require_ \
and _do|perlfunc/do_."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003003"

RPM_NAME = "perl-Module-Reader-0.003003-1.23.noarch.rpm"
RPM_HASH = "fa9d6f775cf543cbae0effec8cc185501359ae0aa13e6b8f96e3153cfa8e14ab59419908727ce5eeaedf66a8d7ff79541ee2909153969092976f9cae26530e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Reader \
perl-Module--Reader--File \
perl-Module-Reader"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
