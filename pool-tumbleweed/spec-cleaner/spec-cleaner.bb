SUMMARY = ".spec file cleaner"
DESCRIPTION = "This script cleans spec file according to some arbitrary style guide. The \
results it produces should always be checked by someone since it is not and \
will never be perfect."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "spec-cleaner-1.2.1-3.8.noarch.rpm"
RPM_HASH = "2c84bb6c60123c13557a394f36f7598ba35f406e4bfe4726a76e0bcee9909f1dc715ddc23b562b6771cb2b272851a53b341649138e1951a1cdc81e5a5a70843e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spec-cleaner \
python3dist-spec-cleaner \
spec-cleaner"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-setuptools"

inherit rpm
