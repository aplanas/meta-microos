SUMMARY = "List processing tools and functional utilities for python"
DESCRIPTION = "A set of python utility functions for iterators, functions, and dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.0"

RPM_NAME = "python310-toolz-0.12.0-1.5.noarch.rpm"
RPM_HASH = "8d44b32c7e1755e443e9a89860f36ffd9d363c7722ccf1b29d8207ac63731f8035a5c3cf1cb466b79785bd11ed237779252a4609116a6eb7bde20801aac6cd61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toolz \
python3.10dist(toolz) \
python310-toolz \
python3dist(toolz)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
