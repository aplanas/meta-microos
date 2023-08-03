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

RPM_NAME = "perl-PAR-Packer-1.59.0-1.1.aarch64.rpm"
RPM_HASH = "d8f08434734ebd14c8bf8ef86fe58c424ac10761f6cec95b17000e2b089eff627623eafd50e0c2c9dd2e81520f9e9da6d464fd1d53084ce67768b4e5387b94f4"

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
