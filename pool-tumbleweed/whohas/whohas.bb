SUMMARY = "Package list querying tool"
DESCRIPTION = "whohas is a command line tool that allows querying several package lists at \
once - currently supported are Arch, Debian, Fedora, Gentoo, Mandriva, \
openSUSE, Slackware (and linuxpackages.net), Source Mage, Ubuntu, FreeBSD, \
NetBSD, OpenBSD, Fink, MacPorts, Cygwin and OpenMoko. whohas is written in Perl \
and was designed to help package maintainers find ebuilds, pkgbuilds and \
similar package definitions from other distributions to learn from. However, it \
can also be used by normal users who want to know: \
 \
 * Which distribution provides packages on which the user depends. \
 * What version of a given package is in use in each distribution, or in each \
   release of a distribution (not implemented for all distributions)."
LICENSE = "GPL-2.0-or-later"

PV = "0.29.1"

RPM_NAME = "whohas-0.29.1-1.19.noarch.rpm"
RPM_HASH = "4ebe7e6b75838b5802f94a43fae3af925f67d4d7bf7e8d34d1ef9b47ab98477df454cf5f00d165c503ee28e2539406dc37ac81ff501504e3838f2c875d251e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "whohas"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-LWP--UserAgent \
perl-Thread--Queue \
perl-forks"

inherit rpm
