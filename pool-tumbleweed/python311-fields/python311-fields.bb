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

RPM_NAME = "python311-fields-5.0.0-4.1.noarch.rpm"
RPM_HASH = "bdb3b9f7750467882c6e50841ecb36e5db8bc7565ad9dafd12e4b836b303915dfa9d9ffacac3e72511e1cbed6ca3946b2bbee6e59358ddb23c9b549bc7400228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fields \
python311-fields \
python3dist-fields"

RDEPENDS:${PN} += "python-abi"

inherit rpm
