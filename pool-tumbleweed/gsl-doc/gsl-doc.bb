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

RPM_NAME = "gsl-doc-2.7.1-1.4.noarch.rpm"
RPM_HASH = "53eb635558c4b53763bf187863e056b72b423389c6072c47ed034419f08d152f934ffcf07c815286fbaecc22190de7b082ce05b9dfd0eedd38cdc69f61278df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
