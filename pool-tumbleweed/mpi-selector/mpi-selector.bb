SUMMARY = "Tool to provide defaults for which MPI implementation to use"
DESCRIPTION = "A simple tool that allows system administrators to set a site-wide \
default for which MPI implementation is to be used, but also allow \
users to set their own defaults MPI implementation, thereby overriding \
the site-wide default. \
 \
The default can be changed easily via the mpi-selector command -- \
editing of shell startup files is not required."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "mpi-selector-1.0.3-13.24.noarch.rpm"
RPM_HASH = "c5c4ade5646f05538fdd89f5d60596abdd09fc22d7acc824712a82854694eda5c2e088b32a24fa49a14db51ece1936150d33ba0d61c61bcb3a4e070f08af7836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mpi-selector) \
mpi-selector"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
