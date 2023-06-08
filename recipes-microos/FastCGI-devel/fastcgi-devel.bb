SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-devel-2.4.0-172.30.aarch64.rpm"
RPM_HASH = "fdb284de709739b009b0730867dbc8ef92278383786eca2ccce836c52007aae0c3812bf3dbaa66e41dfc121cb817c03e076e30230be4a641b410fb9c54b4cc59"

RPROVIDES:${PN} += "FastCGI-devel FastCGI-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libfcgi0"

inherit rpm
