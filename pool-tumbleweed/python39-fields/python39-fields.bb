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

RPM_NAME = "python39-fields-5.0.0-4.3.noarch.rpm"
RPM_HASH = "ad4001c7a4b1e5bae24673791b3ed0f92868a00d8ea83c41bd7a6baa46265993a65fc0f854695428bca26597d1de9e72dc436b74bbf2eced3322263317d43f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fields \
python39-fields \
python3dist-fields"

RDEPENDS:${PN} += "python-abi"

inherit rpm
