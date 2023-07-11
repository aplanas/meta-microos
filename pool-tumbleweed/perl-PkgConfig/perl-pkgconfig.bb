SUMMARY = "Pure-Perl Core-Only replacement for pkg-config"
DESCRIPTION = "'PkgConfig' provides a pure-perl, core-only replacement for the \
'pkg-config' utility. \
 \
This is not a description of the uses of 'pkg-config' but rather a \
description of the differences between the C version and the Perl one. \
 \
While 'pkg-config' is a compiled binary linked with glib, the pure-perl \
version has no such requirement, and will run wherever Perl ( >= 5.6 ) \
does. \
 \
The main supported options are the common '--libs', '--cflags', '--static', \
'--exists' and '--modversion'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25026"

RPM_NAME = "perl-PkgConfig-0.25026-1.4.aarch64.rpm"
RPM_HASH = "f04b15f6e8e3288fabbe06a61c55b0d7d1b878df862691d1a43d7ebf01baee6d0064d72b7bf754afc1828a3c8850be9a1e4918e17f037eb6389b68d12e8b075e"

RPROVIDES:${PN} += "perl-PkgConfig \
perl-PkgConfig--Script"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
