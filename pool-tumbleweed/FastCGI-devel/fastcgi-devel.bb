SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-devel-2.4.0-173.3.aarch64.rpm"
RPM_HASH = "e6592edf75b980ca72dc93a2516093c1a7dc0fc4967a34a39b8c84af0c714724c7a6369104004ee88aa54a9eb9619b8fe104f891630a9a79c97f2b85c3bef597"

RPROVIDES:${PN} += "FastCGI-devel"

RDEPENDS:${PN} += "glibc-devel \
libfcgi0"

inherit rpm
