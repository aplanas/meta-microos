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

RPM_NAME = "mpi-selector-1.0.3-14.2.noarch.rpm"
RPM_HASH = "2dc04fbe63dc6c0bcac6d9280c6d6981949fee87e4f4b10e9194b4bd1a2a81ca6005ef61128e0c6a3863b4b1ba99fd01aa6149da79af6ed792fc4de961bcd2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mpi-selector \
mpi-selector"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
