SUMMARY = "Program for reading and writing spatial data files"
DESCRIPTION = "Command-line interface for reading and writing spatial data \
using OGR's Fiona package."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "fiona-fio-1.9.1-1.6.noarch.rpm"
RPM_HASH = "702b3fda35b96c382ab79e0dadebe3b62665dda997c273b804a0e49ab5c9bba1fec4a49d5e03633b178aee388162f1f6b335229042da203e5122c578ee061ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fiona-fio"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-Fiona"

inherit rpm
