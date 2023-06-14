SUMMARY = "Easily test network connectivity"
DESCRIPTION = "This module is intended to easily test network connectivity before \
functional tests begin to non-local Internet resources. It does not require \
any modules beyond those supplied in core Perl. \
 \
If you do not specify a host/port pair, then the module defaults to using \
'www.google.com' on port '80'. \
 \
You may optionally specify the port by its name, as in 'http' or 'ldap'. If \
you do this, the test module will attempt to look up the port number using \
'getservbyname'. \
 \
If you do specify a host and port, they must be specified in *pairs*. It is \
a fatal error to omit one or the other. \
 \
If the environment variable 'NO_NETWORK_TESTING' is set, then the tests \
will be skipped without attempting any socket connections. \
 \
If the sockets cannot connect to the specified hosts and ports, the \
exception is caught, reported and the tests skipped."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Test-RequiresInternet-0.05-1.26.noarch.rpm"
RPM_HASH = "bcad611dffa9febabe4eed41e7c1cdea738b03a46d7463b3296ab94be52e762982935520667d798d17a114fe0d9409484de8c990f03f75b0dc1c9822537fdde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--RequiresInternet \
perl-Test-RequiresInternet"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
