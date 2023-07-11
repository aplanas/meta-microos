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

RPM_NAME = "gsl_2_7_1-gnu-hpc-doc-2.7.1-1.4.noarch.rpm"
RPM_HASH = "8e49e5f16afed56815e4d7941eef5c1c3a9e0f0bc04f24050ae639db3406f2e72af06ecb1db801141c659d27e976f219fca390675eb4cdc05663c87e9dbee9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
