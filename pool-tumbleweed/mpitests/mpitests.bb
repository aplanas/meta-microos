SUMMARY = "MPI Benchmarks common files"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-3.2-12.1.aarch64.rpm"
RPM_HASH = "18b4ed8335d5d86372a0db27f1dd3114cb4ad286a8e18bab6385a777fe835246ff01197b1215a9a9c65f239a6da5104bf4485c2cbe76122fe92ccc32430fa7fe"

RPROVIDES:${PN} += "mpitests"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
