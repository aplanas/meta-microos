SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python311-weblate-schemas-2022.1-1.3.noarch.rpm"
RPM_HASH = "f6f89a9bee66b8d666e63365f8c9ca868b95ccf842bf6f119ba9f8bc46d317721c4a7177d8d545a22742af22395ff89b82d2fafebfefdf92371a2572f310f061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(weblate-schemas) \
python311-weblate-schemas \
python3dist(weblate-schemas)"
RDEPENDS:${PN} += "python(abi) \
python311-jsonschema"

inherit rpm
