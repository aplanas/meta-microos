SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python310-k5test-0.10.3-2.1.noarch.rpm"
RPM_HASH = "7b1fffe9f713e611955f8d1047745855ff6ea2b180d64eb1e81ba2d5240a151f7ec963b81212617d66971752d8a941ede1d379ba3c1a5b8d926d5c424a4dac32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-k5test \
python3.10dist-k5test \
python310-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
python-abi"

inherit rpm
