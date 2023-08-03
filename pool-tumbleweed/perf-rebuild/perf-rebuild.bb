SUMMARY = "Empty package to ensure rebuilding perf in OBS"
DESCRIPTION = "This is an empty package that ensures perf is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "perf-rebuild-6.4.6-80.12.aarch64.rpm"
RPM_HASH = "bacf06428498c56b491631d3b41235619a40a71ece0564e9e249815427a943d714971ccc53d7b7882d0c14e21f6193a0d7a5e2b0a27d582d6f742104bbfa7393"

RPROVIDES:${PN} += "perf-rebuild"

RDEPENDS:${PN} += "kernel-source"

inherit rpm
