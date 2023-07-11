SUMMARY = "Libraries shared between Net::OpenID::Consumer and Net::OpenID::Server"
DESCRIPTION = "The Consumer and Server implementations share a few libraries which live \
with this module. This module is here largely to hold the version number \
and this documentation, though it also incorporates some utility functions \
inherited from previous versions of Net::OpenID::Consumer."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20"

RPM_NAME = "perl-Net-OpenID-Common-1.20-1.26.noarch.rpm"
RPM_HASH = "4a7de4989bf6c67605deb7fac4fad715d9457dec87ed86cdc849daabb7dcadc322caf2a956a0c082f1ed8bd14046c590383c9c0c7a38aa64e41971ffa4439154"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Crypt--DH--GMP \
perl-HTML--Parser \
perl-HTTP--Headers--Util \
perl-HTTP--Message \
perl-HTTP--Request \
perl-HTTP--Status \
perl-XML--Simple"

inherit rpm
