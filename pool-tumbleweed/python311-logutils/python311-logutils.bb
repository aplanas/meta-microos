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

RPM_NAME = "python311-logutils-0.3.5-5.4.noarch.rpm"
RPM_HASH = "79f50247f697e9795b323c11986f81f67f10a0f74b26704c6fe629aebddbc50583c4c1c5da4b55238c02ed7b52ece29616ffef2cd55145c1804fc63e9d3a27bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logutils \
python3.11dist-logutils \
python311-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
