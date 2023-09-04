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

RPM_NAME = "perl-Devel-PPPort-3.68-1.11.aarch64.rpm"
RPM_HASH = "41e826b816d8e536613f75776959cd6978150e2d489be5f8775f5dff529571818fb24562e8008130b8bd4e9ed51e5e13f201bbdabf621c8f57c9540b944515a8"

RPROVIDES:${PN} += "perl-Devel--PPPort \
perl-Devel-PPPort"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
