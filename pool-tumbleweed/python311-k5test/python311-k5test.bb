SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python311-k5test-0.10.3-2.2.noarch.rpm"
RPM_HASH = "5b4887be8f6aed879cd0aff5a32bca558bf98b73da0153980cf8cc6a4f4cfb7ddb719a6304edff12f78da5ce0e9bd6e77ebdbbd0fc17b753805fe22a9d61eab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-k5test \
python3.11dist-k5test \
python311-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
python-abi"

inherit rpm
