SUMMARY = "Perl implementation of GNTP Protocol (Client Part)"
DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Growl-GNTP-0.21-1.22.noarch.rpm"
RPM_HASH = "fe43e066c056ef9d6a12070d86d677b428fdad04342cbca6f75885dc0d5731bc52282eee8e2cd154e604468acd8a2a2f24282d7c36d3c444adf8c5d17c15c337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Growl::GNTP) \
perl-Growl-GNTP"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Crypt::CBC) \
perl(Data::UUID) \
perl(Digest::SHA)"

inherit rpm
