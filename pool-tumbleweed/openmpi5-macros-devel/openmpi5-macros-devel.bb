SUMMARY = "Macros for openMPI version 5.0.0"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.0."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-macros-devel-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "3d7787aba77cb778c1d2d0aea9e7b2ac325334750188e237d8e0febefda355f023f1fca98ff3bb456c63b5fc5c96881006bf001f1c7954ed9a3b1911747984eb"

RPROVIDES:${PN} += "openmpi-macros-provider \
openmpi5-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi5-devel"

inherit rpm
