SUMMARY = "Utilities used to analyse results from elk"
DESCRIPTION = "This package provides utilities useful for analysis elk outputs."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-utils-8.7.2-1.3.noarch.rpm"
RPM_HASH = "10b4ed1a7450b3b50b66d504f6ed4c7d42e450dae48f70973cd12774cb26869ac71d07a2b33f6b9d9afbaf36db33f614a355124a19cf4ec186330a3bfb8be33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elk-utils"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
awk \
elk-data \
gnuplot"

inherit rpm
