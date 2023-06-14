SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi3-hpc-devel-static-3.3.10-3.4.aarch64.rpm"
RPM_HASH = "763451145aedf70578452357db5fcbe5c45753c3a58d342661340684252d9516a9433b407ac0499f83e8641e78acb5fa522fcf8c5c9e2283fb5a42e494f71dfb"

RPROVIDES:${PN} += "fftw3-3-3-10-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "fftw3-3-3-10-gnu-openmpi3-hpc-devel"

inherit rpm
