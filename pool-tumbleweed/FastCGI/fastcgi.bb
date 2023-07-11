SUMMARY = "A Scalable, Open Extension to CGI"
DESCRIPTION = "FastCGI is a language-independent, scalable, open extension to CGI that \
provides high performance without the limitations of server-specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-2.4.0-173.2.aarch64.rpm"
RPM_HASH = "2c5bb18cc2ab4580b313ae04128cdc77ab5a7d1e4ce102ee4a7fa4a098c89a41237abcc5a050710ed1d00ec80fcd313a0b4cae0e3badea6561c5dd88cccbfb86"

RPROVIDES:${PN} += "FastCGI"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcgi.so.0"

inherit rpm
