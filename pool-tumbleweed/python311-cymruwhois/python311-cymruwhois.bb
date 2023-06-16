SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python311-cymruwhois-1.6-2.13.noarch.rpm"
RPM_HASH = "ec41f8240a8a408f64640d953601e988679036ec5eaefe23dbd0677724ca6ece6ad7820cff08e704d2853b8ee3571324ffcc6b88f87ef906d66410015e0d8564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3.11dist-cymruwhois \
python311-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
