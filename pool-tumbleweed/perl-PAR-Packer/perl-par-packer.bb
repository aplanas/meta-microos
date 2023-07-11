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

PV = "1.057"

RPM_NAME = "perl-PAR-Packer-1.057-1.4.aarch64.rpm"
RPM_HASH = "e4f0e10b8b0fe2f561323ca4e14f10d4c91e1252907d763c5f454027b4a145412eb2d0f0a2adf997a0de04cb2ffd863de2933747d6a4167ba7bec1f409794358"

RPROVIDES:${PN} += "perl-App--Packer--PAR \
perl-PAR--Filter \
perl-PAR--Filter--Bleach \
perl-PAR--Filter--Bytecode \
perl-PAR--Filter--Obfuscate \
perl-PAR--Filter--PatchContent \
perl-PAR--Filter--PodStrip \
perl-PAR--Packer \
perl-PAR--StrippedPARL--Base \
perl-PAR--StrippedPARL--Dynamic \
perl-PAR--StrippedPARL--Static \
perl-PAR-Packer \
perl-pp"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Zip \
perl-Compress--Zlib \
perl-Digest--SHA \
perl-Getopt--ArgvFile \
perl-IO--Compress--Gzip \
perl-Module--ScanDeps \
perl-PAR \
perl-PAR--Dist"

inherit rpm
