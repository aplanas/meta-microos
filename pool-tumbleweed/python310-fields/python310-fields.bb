SUMMARY = "Container class boilerplate killer"
DESCRIPTION = "Container class boilerplate killer. \
Features: \
  * Human-readable ``__repr__`` \
  * Complete set of comparison methods \
  * Keyword and positional argument support. Works like a normal class - you can override just about anything in the \
    subclass (eg: a custom ``__init__``). In contrast, `hynek/characteristic <https://github.com/hynek/characteristic>`_ \
    forces different call schematics and calls your ``__init__`` with different arguments."
LICENSE = "BSD-2-Clause"

PV = "5.0.0"

RPM_NAME = "python310-fields-5.0.0-4.1.noarch.rpm"
RPM_HASH = "d849b8c36a4890f166eee7f7899666ec2410f07b76032ee247a4d026b73a70a0416de312b228987e1c80645f5983d43c4a7633e9a82f528cbf4dda7b17d43fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fields \
python3.10dist(fields) \
python310-fields \
python3dist(fields)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
