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

RPM_NAME = "mpi-selector-1.0.3-13.25.noarch.rpm"
RPM_HASH = "c75536a7a4916671980dfff92f8c4bec1f2a6ce7404463d82fd4b2fd39f6291435454b74906bde42b636fe85c4e40665738e45c6603e1d04f71add97eb2ef803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mpi-selector \
mpi-selector"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
