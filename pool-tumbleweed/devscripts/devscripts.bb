SUMMARY = "Scripts to make the life of a Debian Package maintainer easier"
DESCRIPTION = "Collection of scripts for working on Debian packages. \
 \
Examples: \
 - bts: A command-line tool for manipulating the Debian Bug \
   Tracking System. \
 - dcontrol: Remotely query package and source control files for \
   all Debian distributions. \
 - debchange/dch: Automagically add entries to debian/changelog \
   files. \
 - debsign, debrsign: Sign a .changes/.dsc pair without needing any \
   of the rest of the package to be present; can sign the pair \
   remotely or fetch the pair from a remote machine for signing. \
 - diff2patches: Extract patches from a .diff.gz file placing them \
    under debian/ or, if present, debian/patches. \
 - licensecheck: Attempt to determine the license of source files. \
 - uscan: Scan upstream sites for new releases of packages."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Artistic-2.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-or-later & GPL-3.0-only & SUSE-Public-Domain & ISC"

PV = "2.22.2"

RPM_NAME = "devscripts-2.22.2-1.6.aarch64.rpm"
RPM_HASH = "8272652e9b79304de6d93e482a5f737d331e356a7c443d365a718a9b537a499f2bfb60b0b9b3900007f14c6447f5f3429e6a41714a385fec1a851d3a95c31c03"

RPROVIDES:${PN} += "deb-/usr/bin/debchange \
devscripts \
perl-Devscripts--Compression \
perl-Devscripts--Config \
perl-Devscripts--DB-File-Lock \
perl-Devscripts--Debbugs \
perl-Devscripts--JSONCache \
perl-Devscripts--MkOrigtargz \
perl-Devscripts--MkOrigtargz--Config \
perl-Devscripts--Output \
perl-Devscripts--PackageDeps \
perl-Devscripts--Packages \
perl-Devscripts--Salsa \
perl-Devscripts--Salsa--Config \
perl-Devscripts--Salsa--Hooks \
perl-Devscripts--Salsa--Repo \
perl-Devscripts--Salsa--add-user \
perl-Devscripts--Salsa--check-repo \
perl-Devscripts--Salsa--checkout \
perl-Devscripts--Salsa--create-repo \
perl-Devscripts--Salsa--del-repo \
perl-Devscripts--Salsa--del-user \
perl-Devscripts--Salsa--fork \
perl-Devscripts--Salsa--forks \
perl-Devscripts--Salsa--group \
perl-Devscripts--Salsa--join \
perl-Devscripts--Salsa--last-ci-status \
perl-Devscripts--Salsa--list-groups \
perl-Devscripts--Salsa--list-repos \
perl-Devscripts--Salsa--merge-request \
perl-Devscripts--Salsa--merge-requests \
perl-Devscripts--Salsa--protect-branch \
perl-Devscripts--Salsa--protected-branches \
perl-Devscripts--Salsa--purge-cache \
perl-Devscripts--Salsa--push \
perl-Devscripts--Salsa--push-repo \
perl-Devscripts--Salsa--rename-branch \
perl-Devscripts--Salsa--search-group \
perl-Devscripts--Salsa--search-project \
perl-Devscripts--Salsa--search-user \
perl-Devscripts--Salsa--update-repo \
perl-Devscripts--Salsa--update-safe \
perl-Devscripts--Salsa--update-user \
perl-Devscripts--Salsa--whoami \
perl-Devscripts--Set \
perl-Devscripts--Uscan---vcs \
perl-Devscripts--Uscan---xtp \
perl-Devscripts--Uscan--CatchRedirections \
perl-Devscripts--Uscan--Config \
perl-Devscripts--Uscan--Ctype--nodejs \
perl-Devscripts--Uscan--Ctype--perl \
perl-Devscripts--Uscan--Downloader \
perl-Devscripts--Uscan--FindFiles \
perl-Devscripts--Uscan--Keyring \
perl-Devscripts--Uscan--Output \
perl-Devscripts--Uscan--Utils \
perl-Devscripts--Uscan--WatchFile \
perl-Devscripts--Uscan--WatchLine \
perl-Devscripts--Uscan--ftp \
perl-Devscripts--Uscan--git \
perl-Devscripts--Uscan--http \
perl-Devscripts--Uscan--svn \
perl-Devscripts--Utils \
perl-Devscripts--Versort \
python3.11dist-devscripts \
python3dist-devscripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
checkbashisms \
dpkg \
html2text \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-File-HomeDir \
perl-IPC-Run \
perl-Moo \
python-abi"

inherit rpm
