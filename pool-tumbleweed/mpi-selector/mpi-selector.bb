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

RPM_NAME = "mpi-selector-1.0.3-14.1.noarch.rpm"
RPM_HASH = "6bdd98dba0fa397c221e4044090e75db6eec0e1469a4207bab7054657f5aa9a300f1767a53ffbcd0740419de04b24067999bcd2375c7a1d4928c68a343a99f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mpi-selector \
mpi-selector"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
