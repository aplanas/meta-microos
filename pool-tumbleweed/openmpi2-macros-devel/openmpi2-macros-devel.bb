SUMMARY = "Macros for openMPI version 2.1.6"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 2.1.6."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-macros-devel-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "5a66678f11a5f46a216dc9075bb5bc9d28d0ceddbfb1e85d311b99759ffa4f69e81dc45eab714955bf9d16e595c4489d0eacf5309967d28db1ec10340c1793fd"

RPROVIDES:${PN} += "config(openmpi2-macros-devel) \
openmpi-macros-provider \
openmpi2-macros-devel \
openmpi2-macros-devel(aarch-64) \
rpm_macro(openmpi_devel_requires) \
rpm_macro(openmpi_prefix) \
rpm_macro(openmpi_requires) \
rpm_macro(setup_openmpi)"

RDEPENDS:${PN} += "openmpi2-devel"

inherit rpm
