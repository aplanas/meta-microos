SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-syms-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "6adfc4b9999e16d5fdbdc21845c60c32cad254d272b61673ed4dffc47a54fe0e84d5d994112bc946234233ade21de9d4d772cad7b83280db98e88ea5aee1a7ac"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-b97b89494481f3409297e494e466bdd42b1311ab \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
