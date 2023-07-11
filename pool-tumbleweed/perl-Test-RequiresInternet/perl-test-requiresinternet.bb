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

RPM_NAME = "perl-Test-RequiresInternet-0.05-1.27.noarch.rpm"
RPM_HASH = "4270e8bd185401fa6d1361508392e91dc3fddc0866f30ed7e5ded7d6354a382faa967b547c1207b03b6c591c9bd0cb4f032fa54894e5d77bdb54a3dc797eabb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--RequiresInternet \
perl-Test-RequiresInternet"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
