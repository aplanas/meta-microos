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

RPM_NAME = "python311-fields-5.0.0-4.3.noarch.rpm"
RPM_HASH = "3de102b45cd59bc418284f28c6a44db679ca276bb2a6b0cb163bca3d84595baad1ab9a9b8432d744aea339012ef9d4f1626b61638d15a4b632f4677df7fbb047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fields \
python3.11dist-fields \
python311-fields \
python3dist-fields"

RDEPENDS:${PN} += "python-abi"

inherit rpm
