SUMMARY = "Headers and development library for libsuperlu6"
DESCRIPTION = "SuperLU headers and libraries files needed for development %{with_hpc:(HPC variant)}"
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu-devel-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "5a1a446d8cc89d30912d0daf6720d4375f449591364163b5ff72b631eb01b4cd125356a01841d8f4525664c7eb52995de949773f5edde162805d38426309abd8"

RPROVIDES:${PN} += "cmake-superlu \
pkgconfig-superlu \
superlu-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsuperlu6"

inherit rpm
