SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python39-k5test-0.10.3-2.1.noarch.rpm"
RPM_HASH = "c85496d1ad25ff56f6e35bbf22feaa276273b71fa1e3e6ea58c2b3e4453b1a530f063906b26fc4f380d76e68339bb814fa3d1f4766a17df9ced46d1f357a24ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-k5test \
python39-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
python-abi"

inherit rpm
