SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-devel-2.4.0-173.1.aarch64.rpm"
RPM_HASH = "e4905b48cb718c1106cfc1545469d748b99491c1f520432229a98c6a441c9026bda856d0c6c0e6a06f25ad951d0fd86c6d37a724dcd522366c985d2a41537375"

RPROVIDES:${PN} += "FastCGI-devel FastCGI-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libfcgi0"

inherit rpm
