SUMMARY = "Utilities used to analyse results from elk"
DESCRIPTION = "This package provides utilities useful for analysis elk outputs."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-utils-8.7.2-1.4.noarch.rpm"
RPM_HASH = "d323f7e5f8761523973829e36bc6e01412f712046ec3d5a7fb14f645e5559c0d558fdbafe764b14e503d1980998bfcf730172c6de104fc9ff62b010eb3ee0e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elk-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
awk \
elk-data \
gnuplot"

inherit rpm
