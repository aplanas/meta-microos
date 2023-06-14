SUMMARY = "Minimal set of tools needed to build yast module"
DESCRIPTION = "Scripts and templates required for rebuilding the existing YaST2 \
modules and components (both ruby and C++)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-buildtools-4.6.1-1.1.noarch.rpm"
RPM_HASH = "ffb8f8e333da0d7ec599cebd14f73d96bec8e91f4a25c095f0b19c28bbbd981c99112d505934105a9216af1f241762f8021512074534da094f78c9611eebe96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-yast2-devtools \
rpm-macro-yast-agentdir \
rpm-macro-yast-build \
rpm-macro-yast-check \
rpm-macro-yast-ci-check \
rpm-macro-yast-clientdir \
rpm-macro-yast-configure \
rpm-macro-yast-controldir \
rpm-macro-yast-desktop-files \
rpm-macro-yast-desktopdir \
rpm-macro-yast-dir \
rpm-macro-yast-docdir \
rpm-macro-yast-execcompdir \
rpm-macro-yast-fillupdir \
rpm-macro-yast-icondir \
rpm-macro-yast-imagedir \
rpm-macro-yast-includedir \
rpm-macro-yast-install \
rpm-macro-yast-libdir \
rpm-macro-yast-localedir \
rpm-macro-yast-logdir \
rpm-macro-yast-metainfo \
rpm-macro-yast-metainfodir \
rpm-macro-yast-moduledir \
rpm-macro-yast-plugindir \
rpm-macro-yast-prep \
rpm-macro-yast-schemadir \
rpm-macro-yast-scrconfdir \
rpm-macro-yast-themedir \
rpm-macro-yast-vardir \
rpm-macro-yast-ybindir \
rpm-macro-yast-ydatadir \
rpm-macro-yast-yncludedir \
rpm-macro-yast-ystartupdir \
yast2-buildtools"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/pkg-config \
autoconf \
automake \
gettext-tools \
perl \
perl-XML-Writer \
pkgconfig"

inherit rpm
