SUMMARY = "Logging utilities"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python310-logutils-0.3.5-5.4.noarch.rpm"
RPM_HASH = "1b1a472d0f48adacbb92c8fbb595893888ba1af26be81bd0fa2402cca12ef5e2d9eb7d082b326ca7c58799597d9a0960233a25ac29357dc0e9c29e20e4bb6402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-logutils \
python310-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
