SUMMARY = "Work with TLD names"
DESCRIPTION = "  The purpose of this module is to provide user with current list of \
  available top level domain names including new ICANN additions and ccTLDs \
  Currently TLD definitions have been acquired from the following sources: \
 \
  http://www.icann.org/tlds/ \
  http://www.dnso.org/constituency/gtld/gtld.html \
  http://www.iana.org/cctld/cctld-whois.htm \
  https://www.iana.org/domains/root/db"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.75"

RPM_NAME = "perl-Net-Domain-TLD-1.75-1.25.noarch.rpm"
RPM_HASH = "02d891cbd3608ae2efdc030511a72e13856459eea906d08484b026909e8c4614c3a6db895e3f12d4212db3767fccb526e7d262f0d4007be5e2205ce5fd71dbf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Domain--TLD \
perl-Net-Domain-TLD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
