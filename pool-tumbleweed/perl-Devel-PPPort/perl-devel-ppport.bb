SUMMARY = "Perl/Pollution/Portability"
DESCRIPTION = "Perl's API has changed over time, gaining new features, new functions, \
increasing its flexibility, and reducing the impact on the C namespace \
environment (reduced pollution). The header file written by this module, \
typically _ppport.h_, attempts to bring some of the newer Perl API features \
to older versions of Perl, so that you can worry less about keeping track \
of old releases, but users can still reap the benefit. \
 \
'Devel::PPPort' contains two functions, 'WriteFile' and 'GetFileContents'. \
'WriteFile''s only purpose is to write the _ppport.h_ C header file. This \
file contains a series of macros and, if explicitly requested, functions \
that allow XS modules to be built using older versions of Perl. Currently, \
Perl versions from 5.003 to 5.20 are supported. \
 \
'GetFileContents' can be used to retrieve the file contents rather than \
writing it out. \
 \
This module is used by 'h2xs' to write the file _ppport.h_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.68"

RPM_NAME = "perl-Devel-PPPort-3.68-1.9.aarch64.rpm"
RPM_HASH = "38ff3aa45374c9131195284e6a825e67d809d62a2dc2de67e9490e65cc6d6e0289826b0d877a18b6e3d5d499ad6c0188128e622d26aa14baffa7f59481ad5c17"

RPROVIDES:${PN} += "perl-Devel--PPPort \
perl-Devel-PPPort"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
