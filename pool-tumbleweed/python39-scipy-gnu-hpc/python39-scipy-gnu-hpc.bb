SUMMARY = "Dependency package for python39-scipy_1_10_1-gnu-hpc"
DESCRIPTION = "python39-scipy: Scientific Tools for Python \
The package python39-scipy-gnu-hpc provides the dependency to get binary package python39-scipy_1_10_1-gnu-hpc. \
When this package gets updated it installs the latest version of python39-scipy_1_10_1-gnu-hpc."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.10.1"

RPM_NAME = "python39-scipy-gnu-hpc-1.10.1-2.4.aarch64.rpm"
RPM_HASH = "eb8752461a08795d634e6fe18ae1008ca9d6362944f18b24741f9f6886fd46215d9a7d427d4b3dcf0c35088146f0b50299e753bac905553cbffc4247b5ef1e97"

RPROVIDES:${PN} += "python39-scipy-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
python39-scipy-1-10-1-gnu-hpc"

inherit rpm
