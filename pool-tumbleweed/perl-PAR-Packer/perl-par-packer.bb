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

RPM_NAME = "perl-PAR-Packer-1.057-1.3.aarch64.rpm"
RPM_HASH = "047bbd80e883fa318a5862f2c01ce4dc661cb1dbb725289950dd2b0ddd343ea25d93ad704f2af4fa9dbdf2a69bd03216a0e29f807af554a99b15c0834b14e588"

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
perl--MODULE-COMPAT-5.36.0 \
perl-Archive--Zip \
perl-Compress--Zlib \
perl-Digest--SHA \
perl-Getopt--ArgvFile \
perl-IO--Compress--Gzip \
perl-Module--ScanDeps \
perl-PAR \
perl-PAR--Dist"

inherit rpm
