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

RPM_NAME = "whohas-0.29.1-1.20.noarch.rpm"
RPM_HASH = "91f0a23810afabb782f1fa2feda60b418f0be963a19e600b7dac8d5ea4085c2184f3d6568592612c99b4171daf629710031e791fc1576dbc1629ea24976a4d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "whohas"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-LWP--UserAgent \
perl-Thread--Queue \
perl-forks"

inherit rpm
