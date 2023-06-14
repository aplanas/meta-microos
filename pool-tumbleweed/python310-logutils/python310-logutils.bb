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

RPM_NAME = "python310-logutils-0.3.5-5.2.noarch.rpm"
RPM_HASH = "2320e132a5fd766f038ad1d2ae00c465910e6310c28f9eab59add8fc9b7df1d46df3b781054058e0aafeed661728d885cd04126dc4917b70b5038ccd794302fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logutils \
python3.10dist-logutils \
python310-logutils \
python3dist-logutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
