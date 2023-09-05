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

RPM_NAME = "gsl-doc-2.7.1-2.1.noarch.rpm"
RPM_HASH = "dba132700ebd3c31aee2160048ea7a6bb869e92ba1db8fdc696d1842b50be92277966a119a3306cd750eb6e1c376e8fcfa2c95cd56ce54d9998692fb270376eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
