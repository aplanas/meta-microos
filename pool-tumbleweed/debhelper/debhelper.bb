SUMMARY = "Helper programs for debian/rules"
DESCRIPTION = "A collection of programs that can be used in a debian/rules file to \
automate common tasks related to building debian packages. Programs \
are included to install various files into your package, compress \
files, fix file permissions, integrate your package with the debian \
menu system, debconf, doc-base, etc. Most debian packages use debhelper \
as part of their build process."
LICENSE = "GPL-2.0-or-later"

PV = "13.11.4"

RPM_NAME = "debhelper-13.11.4-1.2.noarch.rpm"
RPM_HASH = "0164ddf944e03540f0407fd3b802752ff3ff5f8e61121ccfb21d8247452f7f4be71b388fa1539dcb9a053afe8c0b64fee98c122222b7940a8a229dc7cb9bb8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb:/usr/bin/dh_install \
debhelper \
perl(Debian::Debhelper::Buildsystem) \
perl(Debian::Debhelper::Buildsystem::ant) \
perl(Debian::Debhelper::Buildsystem::autoconf) \
perl(Debian::Debhelper::Buildsystem::cmake) \
perl(Debian::Debhelper::Buildsystem::makefile) \
perl(Debian::Debhelper::Buildsystem::meson) \
perl(Debian::Debhelper::Buildsystem::ninja) \
perl(Debian::Debhelper::Buildsystem::perl_build) \
perl(Debian::Debhelper::Buildsystem::perl_makemaker) \
perl(Debian::Debhelper::Buildsystem::python_distutils) \
perl(Debian::Debhelper::Buildsystem::qmake) \
perl(Debian::Debhelper::Buildsystem::qmake_qt4) \
perl(Debian::Debhelper::DH::AddonAPI) \
perl(Debian::Debhelper::DH::SequenceState) \
perl(Debian::Debhelper::Dh_Buildsystems) \
perl(Debian::Debhelper::Dh_Getopt) \
perl(Debian::Debhelper::Dh_Lib) \
perl(Debian::Debhelper::Dh_Version) \
perl(Debian::Debhelper::Sequence) \
perl(Debian::Debhelper::SequencerUtil)"

RDEPENDS:${PN} += "/usr/bin/perl \
dh-autoreconf \
dpkg \
perl \
strip-nondeterminism"

inherit rpm
