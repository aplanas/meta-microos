SUMMARY = "Library for consumers of OpenID identities"
DESCRIPTION = "This is the Perl API for (the consumer half of) OpenID, a distributed \
identity system based on proving you own a URL, which is then your \
identity. More information is available at: \
 \
  http://openid.net/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.18"

RPM_NAME = "perl-Net-OpenID-Consumer-1.18-1.26.noarch.rpm"
RPM_HASH = "422446be3f4ebe1b594de7640cdf9f95455f5591352d64090477c2d700bbf697b77b916df3b8e1d09a74193aca4796dd1896aec362e589e3b0ae1557de171a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenID--Association \
perl-Net--OpenID--ClaimedIdentity \
perl-Net--OpenID--Consumer \
perl-Net--OpenID--VerifiedIdentity \
perl-Net-OpenID-Consumer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--SHA \
perl-HTTP--Request \
perl-JSON \
perl-LWP--UserAgent \
perl-Net--OpenID--Common \
perl-URI"

inherit rpm
