SUMMARY = "Mozilla's CA cert bundle in PEM format"
DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL. \
 \
The module provide a single function: \
 \
* SSL_ca_file() \
 \
Returns the absolute path to the Mozilla's CA cert bundle PEM file."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "20230807.0.0"

RPM_NAME = "perl-Mozilla-CA-20230807.0.0-1.1.noarch.rpm"
RPM_HASH = "6aa264fb461a56e20911cb35b9dd60902fb2ec27f1a23fbc6194dd74267c1fdf63f07aca4d0d1c6451ea175fa6772396ee405fb119a2721a088308b7eaf0c7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mozilla--CA \
perl-Mozilla-CA"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
