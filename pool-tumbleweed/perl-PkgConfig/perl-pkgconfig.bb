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

RPM_NAME = "perl-PkgConfig-0.25026-1.5.aarch64.rpm"
RPM_HASH = "3a77079ca4fa4694918c1b3528bbd8d45c3d55513dd9ce490a77603e70f5a402143d900120b0e3e468a26e89841e8c4af43178652f63091c960c9cc85ea108aa"

RPROVIDES:${PN} += "perl-PkgConfig \
perl-PkgConfig--Script"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
