SUMMARY = "Static libraries for fftw3"
DESCRIPTION = "Libraries to build statically linked applications with fftw3."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3_3_3_10-gnu-openmpi1-hpc-devel-static-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "2bcb254f41c958c0e064bc7b63302c2249eb24ff545ac5d70441886cfd581c6f138b0382a6baddb76bc2c07e46de5b67bcc74b0c4878333605b1ef3b1143f3ec"

RPROVIDES:${PN} += "fftw3_3_3_10-gnu-openmpi1-hpc-devel-static \
fftw3_3_3_10-gnu-openmpi1-hpc-devel-static(aarch-64)"
RDEPENDS:${PN} += "fftw3_3_3_10-gnu-openmpi1-hpc-devel"

inherit rpm
