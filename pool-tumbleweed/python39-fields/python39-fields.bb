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

RPM_NAME = "python39-fields-5.0.0-4.1.noarch.rpm"
RPM_HASH = "515866ac6e8a395edfd4c0ee12b4b517797efe3c3af29e33dc10350d7327f4c24ee9499f5748b86d3e09e426d8c6ea40e638f74eb8cd07794618e3c3036c8fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fields) \
python39-fields \
python3dist(fields)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
