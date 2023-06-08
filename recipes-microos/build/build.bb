SUMMARY = "A Script to Build SUSE Linux RPMs"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot environment."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230502"

RPM_NAME = "build-20230502-1.1.noarch.rpm"
RPM_HASH = "82f82db0c96d3facb01521a23f898ce26b5c62f5c258da4fd2ba624d4b71aa33f4e35dbb4ad2fbe3326a749410499fdc6a4af51daf98dd0c14fa03dfe35efc57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build config(build) perl(Build) perl(Build::Appimage) perl(Build::Arch) perl(Build::Archrepo) perl(Build::Collax) perl(Build::Deb) perl(Build::Debrepo) perl(Build::Docker) perl(Build::Download) perl(Build::Expand) perl(Build::Features) perl(Build::Fissile) perl(Build::Flatpak) perl(Build::Helm) perl(Build::Intrepo) perl(Build::Kiwi) perl(Build::LiveBuild) perl(Build::Mdkrepo) perl(Build::Mkosi) perl(Build::Modulemd) perl(Build::Modules) perl(Build::Options) perl(Build::Repo) perl(Build::Rpm) perl(Build::Rpmmd) perl(Build::SimpleJSON) perl(Build::SimpleXML) perl(Build::SimpleYAML) perl(Build::Snapcraft) perl(Build::Susetags) perl(Build::Zypp) perl(PBuild::AssetMgr) perl(PBuild::BuildResult) perl(PBuild::Cando) perl(PBuild::Checker) perl(PBuild::Container) perl(PBuild::Cpio) perl(PBuild::Depsort) perl(PBuild::Distro) perl(PBuild::Expand) perl(PBuild::ExportFilter) perl(PBuild::Job) perl(PBuild::Link) perl(PBuild::LocalRepo) perl(PBuild::Meta) perl(PBuild::Modules) perl(PBuild::Multibuild) perl(PBuild::OBS) perl(PBuild::Options) perl(PBuild::Preset) perl(PBuild::Recipe) perl(PBuild::RemoteAssets) perl(PBuild::RemoteRegistry) perl(PBuild::RemoteRepo) perl(PBuild::RepoMgr) perl(PBuild::Repoquery) perl(PBuild::Result) perl(PBuild::Service) perl(PBuild::Source) perl(PBuild::Structured) perl(PBuild::Util) perl(PBuild::Verify) perl(PBuild::Zip)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl bash binutils build-mkbaselibs findutils perl perl(POSIX) psmisc tar"

inherit rpm
