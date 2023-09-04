SUMMARY = "PAR Packager"
DESCRIPTION = "This module implements the *App::Packer::Backend* interface, for generating \
stand-alone executables, perl scripts and PAR files. \
 \
Currently, this module is used by the command line tool *pp* internally, as \
well as by the contributed _contrib/gui_pp/gpp_ program. \
 \
Since version 0.97 of PAR, this module and its related tools such as 'pp' \
have been stripped from the PAR distribution and are now distributed as the \
'PAR-Packer' distribution so that PAR users need not necessarily have a C \
compiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.59.0"

RPM_NAME = "perl-PAR-Packer-1.59.0-1.2.aarch64.rpm"
RPM_HASH = "12e0d92b9d9cfe9a4764fd97baba209a83f7f991f9e7a03f2ee42ac77e72db96645ec2374351d9b2fda1beac1a575e44023b3d592ad05043b0ff2a78481d0d25"

RPROVIDES:${PN} += "perl-App--Packer--PAR \
perl-PAR--Filter \
perl-PAR--Filter--Bleach \
perl-PAR--Filter--Bytecode \
perl-PAR--Filter--Obfuscate \
perl-PAR--Filter--PatchContent \
perl-PAR--Filter--PodStrip \
perl-PAR--Packer \
perl-PAR--StrippedPARL--Base \
perl-PAR-Packer \
perl-pp"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Zip \
perl-Compress--Zlib \
perl-Digest--SHA \
perl-Getopt--ArgvFile \
perl-IO--Compress--Gzip \
perl-Module--ScanDeps \
perl-PAR \
perl-PAR--Dist"

inherit rpm
