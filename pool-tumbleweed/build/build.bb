SUMMARY = "A Script to Build SUSE Linux RPMs"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot environment."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230628"

RPM_NAME = "build-20230628-1.1.noarch.rpm"
RPM_HASH = "19d38abad8fdda76fd79570d49c33b87f51a23729cafe83ecee2041d3d618b90a21e1519f7fb6b969e41806b39fa8620103fc0234a5f5354aef6cbaabeefca78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build \
config-build \
perl-Build \
perl-Build--Appimage \
perl-Build--Arch \
perl-Build--Archrepo \
perl-Build--Collax \
perl-Build--Deb \
perl-Build--Debrepo \
perl-Build--Docker \
perl-Build--Download \
perl-Build--Expand \
perl-Build--Features \
perl-Build--Fissile \
perl-Build--Flatpak \
perl-Build--Helm \
perl-Build--Intrepo \
perl-Build--Kiwi \
perl-Build--LiveBuild \
perl-Build--Mdkrepo \
perl-Build--Mkosi \
perl-Build--Modulemd \
perl-Build--Modules \
perl-Build--Options \
perl-Build--Repo \
perl-Build--Rpm \
perl-Build--Rpmmd \
perl-Build--SimpleJSON \
perl-Build--SimpleXML \
perl-Build--SimpleYAML \
perl-Build--Snapcraft \
perl-Build--Susetags \
perl-Build--Zypp \
perl-PBuild--AssetMgr \
perl-PBuild--BuildResult \
perl-PBuild--Cando \
perl-PBuild--Checker \
perl-PBuild--Container \
perl-PBuild--Cpio \
perl-PBuild--Depsort \
perl-PBuild--Distro \
perl-PBuild--Expand \
perl-PBuild--ExportFilter \
perl-PBuild--Job \
perl-PBuild--Link \
perl-PBuild--LocalRepo \
perl-PBuild--Meta \
perl-PBuild--Modules \
perl-PBuild--Multibuild \
perl-PBuild--OBS \
perl-PBuild--Options \
perl-PBuild--Preset \
perl-PBuild--Recipe \
perl-PBuild--RemoteAssets \
perl-PBuild--RemoteRegistry \
perl-PBuild--RemoteRepo \
perl-PBuild--RepoMgr \
perl-PBuild--Repoquery \
perl-PBuild--Result \
perl-PBuild--Service \
perl-PBuild--Source \
perl-PBuild--Structured \
perl-PBuild--Util \
perl-PBuild--Verify \
perl-PBuild--Zip"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
bash \
binutils \
build-mkbaselibs \
findutils \
perl \
perl-POSIX \
psmisc \
tar"

inherit rpm
