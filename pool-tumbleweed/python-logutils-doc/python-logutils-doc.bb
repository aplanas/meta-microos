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

RPM_NAME = "python-logutils-doc-0.3.5-5.4.noarch.rpm"
RPM_HASH = "e925f5a03d86b819aab677bb6b0affd75f9e1ad37250900e50597e749ae502af4dd1139568fa6c6ea4c9c7c84c05de020ef163531ee6cddfcb8d79fd64657690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-logutils-doc \
python310-logutils-doc \
python311-logutils-doc \
python39-logutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
