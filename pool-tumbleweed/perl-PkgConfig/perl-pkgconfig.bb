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

RPM_NAME = "perl-PkgConfig-0.25026-1.3.aarch64.rpm"
RPM_HASH = "7401f837407c9779cc418cfadfff336aa3cb09d3829f3fda0d309649c605922f86df6be4b00779fc4c357eb3673f5daf21677803e51528939adb333d0898181e"

RPROVIDES:${PN} += "perl-PkgConfig \
perl-PkgConfig--Script"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-Test--More"

inherit rpm
