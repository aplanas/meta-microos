SUMMARY = "Library for consumers of OpenID identities"
DESCRIPTION = "This is the Perl API for (the consumer half of) OpenID, a distributed \
identity system based on proving you own a URL, which is then your \
identity. More information is available at: \
 \
  http://openid.net/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.18"

RPM_NAME = "perl-Net-OpenID-Consumer-1.18-1.25.noarch.rpm"
RPM_HASH = "cd928778ba19dbf1ff363eda6704740ca2e8b96a77eca22232ad2d0466b25e37e6eef6b43253d294ae847badc1e5865b414de9b38ada5219729623349a453771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenID--Association \
perl-Net--OpenID--ClaimedIdentity \
perl-Net--OpenID--Consumer \
perl-Net--OpenID--VerifiedIdentity \
perl-Net-OpenID-Consumer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--SHA \
perl-HTTP--Request \
perl-JSON \
perl-LWP--UserAgent \
perl-Net--OpenID--Common \
perl-URI"

inherit rpm
