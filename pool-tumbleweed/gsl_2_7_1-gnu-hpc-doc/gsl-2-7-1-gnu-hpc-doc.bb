SUMMARY = "Documentation for the GNU Scientific Library"
DESCRIPTION = "This package contains documentation for GSL \
 \
The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C, and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-doc-2.7.1-1.3.noarch.rpm"
RPM_HASH = "9c5b566306dac194de18a9f3fc0056067485b1160041ab9268e5b8a74594f8f1b79cb37cc06bfcff3aee9d2465d02ad29f4f30455035c2b0908e80aadc604f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl_2_7_1-gnu-hpc-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
