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

RPM_NAME = "devscripts-2.22.2-1.3.aarch64.rpm"
RPM_HASH = "2dc6611689170ee602f5f3338675a325a6ab9fd813011e7ac43aff853f34b1eb3b7693aecc7ed1709e121f3d5290201bbe414a926dff9e247c20e63ab31b3ce2"

RPROVIDES:${PN} += "deb:/usr/bin/debchange \
devscripts \
devscripts(aarch-64) \
perl(Devscripts::Compression) \
perl(Devscripts::Config) \
perl(Devscripts::DB_File_Lock) \
perl(Devscripts::Debbugs) \
perl(Devscripts::JSONCache) \
perl(Devscripts::MkOrigtargz) \
perl(Devscripts::MkOrigtargz::Config) \
perl(Devscripts::Output) \
perl(Devscripts::PackageDeps) \
perl(Devscripts::Packages) \
perl(Devscripts::Salsa) \
perl(Devscripts::Salsa::Config) \
perl(Devscripts::Salsa::Hooks) \
perl(Devscripts::Salsa::Repo) \
perl(Devscripts::Salsa::add_user) \
perl(Devscripts::Salsa::check_repo) \
perl(Devscripts::Salsa::checkout) \
perl(Devscripts::Salsa::create_repo) \
perl(Devscripts::Salsa::del_repo) \
perl(Devscripts::Salsa::del_user) \
perl(Devscripts::Salsa::fork) \
perl(Devscripts::Salsa::forks) \
perl(Devscripts::Salsa::group) \
perl(Devscripts::Salsa::join) \
perl(Devscripts::Salsa::last_ci_status) \
perl(Devscripts::Salsa::list_groups) \
perl(Devscripts::Salsa::list_repos) \
perl(Devscripts::Salsa::merge_request) \
perl(Devscripts::Salsa::merge_requests) \
perl(Devscripts::Salsa::protect_branch) \
perl(Devscripts::Salsa::protected_branches) \
perl(Devscripts::Salsa::purge_cache) \
perl(Devscripts::Salsa::push) \
perl(Devscripts::Salsa::push_repo) \
perl(Devscripts::Salsa::rename_branch) \
perl(Devscripts::Salsa::search_group) \
perl(Devscripts::Salsa::search_project) \
perl(Devscripts::Salsa::search_user) \
perl(Devscripts::Salsa::update_repo) \
perl(Devscripts::Salsa::update_safe) \
perl(Devscripts::Salsa::update_user) \
perl(Devscripts::Salsa::whoami) \
perl(Devscripts::Set) \
perl(Devscripts::Uscan::CatchRedirections) \
perl(Devscripts::Uscan::Config) \
perl(Devscripts::Uscan::Ctype::nodejs) \
perl(Devscripts::Uscan::Ctype::perl) \
perl(Devscripts::Uscan::Downloader) \
perl(Devscripts::Uscan::FindFiles) \
perl(Devscripts::Uscan::Keyring) \
perl(Devscripts::Uscan::Output) \
perl(Devscripts::Uscan::Utils) \
perl(Devscripts::Uscan::WatchFile) \
perl(Devscripts::Uscan::WatchLine) \
perl(Devscripts::Uscan::_vcs) \
perl(Devscripts::Uscan::_xtp) \
perl(Devscripts::Uscan::ftp) \
perl(Devscripts::Uscan::git) \
perl(Devscripts::Uscan::http) \
perl(Devscripts::Uscan::svn) \
perl(Devscripts::Utils) \
perl(Devscripts::Versort) \
python3.10dist(devscripts) \
python3dist(devscripts)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/python3 \
checkbashisms \
dpkg \
html2text \
libc.so.6(GLIBC_2.34)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl-File-HomeDir \
perl-IPC-Run \
perl-Moo \
python(abi)"

inherit rpm
