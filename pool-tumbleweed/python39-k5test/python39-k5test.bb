SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python39-k5test-0.10.3-2.2.noarch.rpm"
RPM_HASH = "9ec296506ab74c392d97b0f4eb6c3bc71216b33a7db7dab47d29b81fe1a3643a3af541b95b2e2d0b964ee3653d8a94754e9281ae4d3180cdd4ad9e35dc14a51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-k5test \
python39-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
python-abi"

inherit rpm
