SUMMARY = "Development files for LAL Inference"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Inference library."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "lalinference-devel-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "5028024727d4e6f90cd29237b4dd21007c9a507e84e5751e65747c88debc3d15f2bf00538a3902977becda7e03981eef07940882b77a111aa998d7fce88e97fa"

RPROVIDES:${PN} += "config(lalinference-devel) \
lalinference-devel \
lalinference-devel(aarch-64) \
pkgconfig(lalinference)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lalinference-data \
liblalinference23 \
pkgconfig(gsl) \
pkgconfig(lal) \
pkgconfig(lalburst) \
pkgconfig(lalframe) \
pkgconfig(lalinspiral) \
pkgconfig(lalmetaio) \
pkgconfig(lalsimulation)"

inherit rpm
