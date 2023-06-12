SUMMARY = "Documentation for python-logutils"
DESCRIPTION = "The logutils package provides a set of handlers for the Python standard \
library's logging package. \
 \
Some of these handlers are out-of-scope for the standard library, and \
so they are packaged here. Others are updated versions which have \
appeared in recent Python releases, but are usable with older versions \
of Python and so are packaged here. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.5"

RPM_NAME = "python-logutils-doc-0.3.5-5.2.noarch.rpm"
RPM_HASH = "b16169fd828e2cb2523881e75d9d713fd67d2eb7d3205cda77e46926eed32b75cea855c71247594020a70545eb950eabac6f0133b2ea5a10dba2d07c4c0d77d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-logutils-doc \
python310-logutils-doc \
python311-logutils-doc \
python39-logutils-doc"
RDEPENDS:${PN} += ""

inherit rpm
