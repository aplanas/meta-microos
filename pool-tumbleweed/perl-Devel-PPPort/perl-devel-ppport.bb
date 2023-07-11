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

RPM_NAME = "perl-Devel-PPPort-3.68-1.10.aarch64.rpm"
RPM_HASH = "b7828ed7a6a112fbef8ff70a4b59611f7991508b74752c4f05bd9cf39aa7df3fa61d7244ca4ea1c27d90cb3607a672a91dad91f263aafc1221f816c9cbd6f181"

RPROVIDES:${PN} += "perl-Devel--PPPort \
perl-Devel-PPPort"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
