SUMMARY = "Dependency package for python311-scipy_1_10_1-gnu-hpc"
DESCRIPTION = "python311-scipy: Scientific Tools for Python \
The package python311-scipy-gnu-hpc provides the dependency to get binary package python311-scipy_1_10_1-gnu-hpc. \
When this package gets updated it installs the latest version of python311-scipy_1_10_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python311-scipy-gnu-hpc-1.10.1-3.1.aarch64.rpm"
RPM_HASH = "7b76f502c1cd1fd5590ff8aa50a8edd1f3a07e1d4fca1fac3fbab3856a1421659f1644dd8e3adfcdd6207e84827b1e88858c6dfc03c8201b162dba3974c197c8"

RPROVIDES:${PN} += "python3-scipy-gnu-hpc \
python311-scipy-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
python311-scipy-1-10-1-gnu-hpc"

inherit rpm
