SUMMARY = "Helper programs for debian/rules"
DESCRIPTION = "A collection of programs that can be used in a debian/rules file to \
automate common tasks related to building debian packages. Programs \
are included to install various files into your package, compress \
files, fix file permissions, integrate your package with the debian \
menu system, debconf, doc-base, etc. Most debian packages use debhelper \
as part of their build process."
LICENSE = "GPL-2.0-or-later"

PV = "13.11.4"

RPM_NAME = "debhelper-13.11.4-1.3.noarch.rpm"
RPM_HASH = "113e16188e72dac62202353197b0574e35364c5c393ff03fd668930282611532c335613091345a3eccd4ac8d15a0ccf5bd892d6a2d96fd25ed1e8bd810297fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb-/usr/bin/dh-install \
debhelper \
perl-Debian--Debhelper--Buildsystem \
perl-Debian--Debhelper--Buildsystem--ant \
perl-Debian--Debhelper--Buildsystem--autoconf \
perl-Debian--Debhelper--Buildsystem--cmake \
perl-Debian--Debhelper--Buildsystem--makefile \
perl-Debian--Debhelper--Buildsystem--meson \
perl-Debian--Debhelper--Buildsystem--ninja \
perl-Debian--Debhelper--Buildsystem--perl-build \
perl-Debian--Debhelper--Buildsystem--perl-makemaker \
perl-Debian--Debhelper--Buildsystem--python-distutils \
perl-Debian--Debhelper--Buildsystem--qmake \
perl-Debian--Debhelper--Buildsystem--qmake-qt4 \
perl-Debian--Debhelper--DH--AddonAPI \
perl-Debian--Debhelper--DH--SequenceState \
perl-Debian--Debhelper--Dh-Buildsystems \
perl-Debian--Debhelper--Dh-Getopt \
perl-Debian--Debhelper--Dh-Lib \
perl-Debian--Debhelper--Dh-Version \
perl-Debian--Debhelper--Sequence \
perl-Debian--Debhelper--SequencerUtil"

RDEPENDS:${PN} += "/usr/bin/perl \
dh-autoreconf \
dpkg \
perl \
strip-nondeterminism"

inherit rpm
