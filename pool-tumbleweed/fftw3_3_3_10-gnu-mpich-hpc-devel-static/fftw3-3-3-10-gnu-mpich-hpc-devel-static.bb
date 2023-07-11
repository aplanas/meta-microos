SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-mpich-hpc-devel-static-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "0f26ea178a9df276605d5c136137558978941dee7512ddf410951db7a9402fcd2a3a9c0e6a95f6a72a3a26fa748a4347af87c3c9cc91e75535376e9db61e2f6f"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-mpich-hpc-devel"

inherit rpm
