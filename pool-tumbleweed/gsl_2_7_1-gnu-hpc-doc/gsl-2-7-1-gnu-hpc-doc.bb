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

RPM_NAME = "gsl_2_7_1-gnu-hpc-doc-2.7.1-2.1.noarch.rpm"
RPM_HASH = "3ca560a52abf7eba610f757084b4a5d31f9e633494123a45116721f51209adebd5b315ba5a9d7b9fd7fa70d0a800f23f478c3b32875407b73043b7471e652f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
