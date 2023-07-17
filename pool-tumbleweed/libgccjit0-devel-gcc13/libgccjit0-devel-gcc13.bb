SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "libgccjit0-devel-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "21a49d649cfcf948a31bdf1df0638a31255a99de078f81f64540c1c758d212aa4e56aae618bcb7b5f0bcbe461cbeec24a82941651938b15b05fdd8f33fd8a51b"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
