SUMMARY = ".spec file cleaner"
DESCRIPTION = "This script cleans spec file according to some arbitrary style guide. The \
results it produces should always be checked by someone since it is not and \
will never be perfect."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "spec-cleaner-1.2.1-3.9.noarch.rpm"
RPM_HASH = "3430190c3596679fa745fdd316ff1332176ff4ce0795705305a6d948aeaae115d6122c041d639e529a4320f81cea50e4b6348259589040856aef191405948f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-spec-cleaner \
python3dist-spec-cleaner \
spec-cleaner"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-setuptools"

inherit rpm
