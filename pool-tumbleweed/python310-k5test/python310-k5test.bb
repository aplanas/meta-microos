SUMMARY = "A library for testing Python applications in krb5 environments"
DESCRIPTION = "k5test is a library for setting up self-contained Kerberos 5 environments, \
and running Python unit tests inside those environments.  It is based on \
the file of the same name found alongside the MIT Kerberos 5 unit tests."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python310-k5test-0.10.3-2.2.noarch.rpm"
RPM_HASH = "51e1f980ae8afad5910cd55b732353a8d40258b31b285fdff277fa58209456e65b7f1078fe4c2eb59a8e41c31bdb0c47b5562a552992949865f65dc50a447949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-k5test \
python310-k5test \
python3dist-k5test"

RDEPENDS:${PN} += "krb5-client \
krb5-server \
python-abi"

inherit rpm
