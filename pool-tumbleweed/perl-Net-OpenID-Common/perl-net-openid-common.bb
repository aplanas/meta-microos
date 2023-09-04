SUMMARY = "Libraries shared between Net::OpenID::Consumer and Net::OpenID::Server"
DESCRIPTION = "The Consumer and Server implementations share a few libraries which live \
with this module. This module is here largely to hold the version number \
and this documentation, though it also incorporates some utility functions \
inherited from previous versions of Net::OpenID::Consumer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20"

RPM_NAME = "perl-Net-OpenID-Common-1.20-1.27.noarch.rpm"
RPM_HASH = "280f3ccf7651d0239e8e0a2536977527c085992d2c83d2df14d0441a056885c86c981d6b1ffd6df5491b3a838066f0913a0b0624a8b79ccd5d1cb1f978286fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenID--Common \
perl-Net--OpenID--Extension \
perl-Net--OpenID--Extension--SimpleRegistration \
perl-Net--OpenID--Extension--SimpleRegistration--Request \
perl-Net--OpenID--Extension--SimpleRegistration--Response \
perl-Net--OpenID--ExtensionMessage \
perl-Net--OpenID--IndirectMessage \
perl-Net--OpenID--URIFetch \
perl-Net--OpenID--URIFetch--Response \
perl-Net--OpenID--Yadis \
perl-Net--OpenID--Yadis--Service \
perl-Net-OpenID-Common \
perl-OpenID--util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Crypt--DH--GMP \
perl-HTML--Parser \
perl-HTTP--Headers--Util \
perl-HTTP--Message \
perl-HTTP--Request \
perl-HTTP--Status \
perl-XML--Simple"

inherit rpm
