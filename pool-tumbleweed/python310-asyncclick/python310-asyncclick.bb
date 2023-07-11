SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python310-asyncclick-8.1.3.4-2.3.noarch.rpm"
RPM_HASH = "b00fab1d6040514fcde54beb45d034e93b6eb4e450549486a2291d95960129aa71f35e407acb27d69ca64bf4c7ee0855ed48b86f3ad8a2e9f655781730ddcf87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asyncclick \
python310-asyncclick \
python3dist-asyncclick"

RDEPENDS:${PN} += "python-abi \
python310-setuptools"

inherit rpm
