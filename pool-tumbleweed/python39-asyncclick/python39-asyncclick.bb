SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python39-asyncclick-8.1.3.4-2.3.noarch.rpm"
RPM_HASH = "7461f5cab5331d5b7cdd6b92b0271655f6d0d6d04b39261ff601c418227db7b90fe395ae036a103aa2bfaadcc32cc7fd725f02066714cbf63d440347accd97a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asyncclick \
python39-asyncclick \
python3dist-asyncclick"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
