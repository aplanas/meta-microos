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

RPM_NAME = "whohas-0.29.1-1.18.noarch.rpm"
RPM_HASH = "158deae14e14f73b4cd564b03ef3c7b3d63d8fe20f7625ef679c5d7f1f7e34468142827336601917eedca80ec0626ba77b4bf81541c6e1ae852892d324ee5802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "whohas"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-LWP--UserAgent \
perl-Thread--Queue \
perl-forks"

inherit rpm
