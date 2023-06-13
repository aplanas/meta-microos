SUMMARY = "A Script to Build SUSE Linux RPMs"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot environment."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230527"

RPM_NAME = "build-20230527-1.1.noarch.rpm"
RPM_HASH = "9ffa138f3adc55a6b60468248e1b92a5f3ea07cfa1954b648b6c13e35c8f6d19bfaed9ac18841f320858cf441a6da41fb88c44d63a811a8a94b1a663a2b0c086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build \
config(build) \
perl(Build) \
perl(Build::Appimage) \
perl(Build::Arch) \
perl(Build::Archrepo) \
perl(Build::Collax) \
perl(Build::Deb) \
perl(Build::Debrepo) \
perl(Build::Docker) \
perl(Build::Download) \
perl(Build::Expand) \
perl(Build::Features) \
perl(Build::Fissile) \
perl(Build::Flatpak) \
perl(Build::Helm) \
perl(Build::Intrepo) \
perl(Build::Kiwi) \
perl(Build::LiveBuild) \
perl(Build::Mdkrepo) \
perl(Build::Mkosi) \
perl(Build::Modulemd) \
perl(Build::Modules) \
perl(Build::Options) \
perl(Build::Repo) \
perl(Build::Rpm) \
perl(Build::Rpmmd) \
perl(Build::SimpleJSON) \
perl(Build::SimpleXML) \
perl(Build::SimpleYAML) \
perl(Build::Snapcraft) \
perl(Build::Susetags) \
perl(Build::Zypp) \
perl(PBuild::AssetMgr) \
perl(PBuild::BuildResult) \
perl(PBuild::Cando) \
perl(PBuild::Checker) \
perl(PBuild::Container) \
perl(PBuild::Cpio) \
perl(PBuild::Depsort) \
perl(PBuild::Distro) \
perl(PBuild::Expand) \
perl(PBuild::ExportFilter) \
perl(PBuild::Job) \
perl(PBuild::Link) \
perl(PBuild::LocalRepo) \
perl(PBuild::Meta) \
perl(PBuild::Modules) \
perl(PBuild::Multibuild) \
perl(PBuild::OBS) \
perl(PBuild::Options) \
perl(PBuild::Preset) \
perl(PBuild::Recipe) \
perl(PBuild::RemoteAssets) \
perl(PBuild::RemoteRegistry) \
perl(PBuild::RemoteRepo) \
perl(PBuild::RepoMgr) \
perl(PBuild::Repoquery) \
perl(PBuild::Result) \
perl(PBuild::Service) \
perl(PBuild::Source) \
perl(PBuild::Structured) \
perl(PBuild::Util) \
perl(PBuild::Verify) \
perl(PBuild::Zip)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
bash \
binutils \
build-mkbaselibs \
findutils \
perl \
perl(POSIX) \
psmisc \
tar"

inherit rpm
