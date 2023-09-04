SUMMARY = "A Scalable, Open Extension to CGI"
DESCRIPTION = "FastCGI is a language-independent, scalable, open extension to CGI that \
provides high performance without the limitations of server-specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-2.4.0-173.3.aarch64.rpm"
RPM_HASH = "8aecfd1f0f96a78a83b1fd696825d360ce853c14dd11462346552759310859bfe74c845f37ef356c7472528312346df8639c3e2b60e99a41330ae3690313e86d"

RPROVIDES:${PN} += "FastCGI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcgi.so.0"

inherit rpm
