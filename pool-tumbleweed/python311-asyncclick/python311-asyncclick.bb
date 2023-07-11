SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "AsyncClick ist a fork of Click that works well with trio or asyncio. \
 \
Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3.4"

RPM_NAME = "python311-asyncclick-8.1.3.4-2.3.noarch.rpm"
RPM_HASH = "74e5155a10f9eaba243665625ae1ff5fe84899b85f09a421e204d050d47272e3e58f0d5e07c56bd62be14927c80e477af6a3b66dca34c9eadfb3dcd60362f416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asyncclick \
python3.11dist-asyncclick \
python311-asyncclick \
python3dist-asyncclick"

RDEPENDS:${PN} += "python-abi \
python311-setuptools"

inherit rpm
