SUMMARY = "RFC-compliant FQDN validation and manipulation for Python"
DESCRIPTION = "This package validates Fully Qualified Domain Names (FQDNs) conforming to the \
Internet Engineering Task Force specification . The design intent is to \
validate that a string would be traditionally acceptable as a public Internet \
hostname to RFC-conforming software, which is a strict subset of the logic in \
modern web browsers like Mozilla Firefox and Chromium that determines whether \
make a DNS lookup. Configuration options can relax constraints so that short \
hostnames without periods or others with underscores will be valid. These \
relaxations are closer to how modern web browsers work."
LICENSE = "MPL-2.0"

PV = "1.5.1"

RPM_NAME = "python311-fqdn-1.5.1-2.3.noarch.rpm"
RPM_HASH = "ed00cc3683cafd0861f4e4e632b5aa5da6095246c3b66d9e3a2c7bfaf8865fbd9ffa3e50631a9ce7ee5441b604c793c2d6ed1f5e7dc26026265bcd1d5a83b10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fqdn \
python3.11dist-fqdn \
python311-fqdn \
python3dist-fqdn"

RDEPENDS:${PN} += "python-abi"

inherit rpm
