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

RPM_NAME = "perl-Net-Domain-TLD-1.75-1.24.noarch.rpm"
RPM_HASH = "086f8f23fce59347f498fd5d17d0ed1112d31f7cfc4dfabd41abb519ad9c4829868d776514514ea28bf46976f05f8b48f3374777e7babdb2c28bb518cdb5f4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Domain--TLD \
perl-Net-Domain-TLD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
