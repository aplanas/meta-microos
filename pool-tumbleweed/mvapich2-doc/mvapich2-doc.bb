SUMMARY = "OSU MVAPICH2 MPI package - Documentation"
DESCRIPTION = "This is an MPI-3 implementation which includes all MPI-1 and MPI-2 features.  It \
is based on MPICH2 and MVICH. This package contains the static libraries"
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-doc-2.3.7-4.4.aarch64.rpm"
RPM_HASH = "3d026d362ad32b1f5565a386f0bdd2cf467baf2614a78e4a73f075cbb76fd5b9d8400fcbabbaf2ee4bc7baac3e5b96a83fab74f5d4348e9b9f60f269c48066d7"

RPROVIDES:${PN} += "mvapich2-doc"

RDEPENDS:${PN} += "mvapich2"

inherit rpm
