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

RPM_NAME = "perl-Net-Domain-TLD-1.75-1.23.noarch.rpm"
RPM_HASH = "3eaa9b7301108e07982ed547356e8be37210a7ec6b702605abcbd75968f8839bc217dbca8c0d1f4427777a1c0941355bd32a509e150f982c77d902f953983aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::Domain::TLD) \
perl-Net-Domain-TLD"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
