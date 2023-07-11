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

RPM_NAME = "python310-fields-5.0.0-4.3.noarch.rpm"
RPM_HASH = "3831ea5fcf0b931b57a163a05ae31340baf2cf287aa792a583941ca540d13edc0f2313e524c0d3ed6e40377f283fba110c9612bc50193a983a838467e832c45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fields \
python310-fields \
python3dist-fields"

RDEPENDS:${PN} += "python-abi"

inherit rpm
