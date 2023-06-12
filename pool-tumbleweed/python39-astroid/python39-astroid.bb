SUMMARY = "Representation of Python source as an AST for pylint"
DESCRIPTION = "This module provides a common base representation of Python source code for \
projects such as pychecker, pyreverse, pylint. The development of this library \
is governed by pylint's needs. \
 \
It provides a compatible representation which comes from the _ast \
module. It rebuilds the tree generated by the builtin _ast module by \
recursively walking down the AST and building an extended ast. The new \
node classes have additional methods and attributes for different \
usages. They include some support for static inference and local name \
scopes. Furthermore, astroid builds partial trees by inspecting living \
objects."
LICENSE = "LGPL-2.1-or-later"

PV = "2.15.5"

RPM_NAME = "python39-astroid-2.15.5-1.1.noarch.rpm"
RPM_HASH = "26d8b68814b3d286e19927dd300016d2b6d52c5d2c7904064799f9ecde70e40fa8716f31a9a10add469fe4eefa810f04084f742f390619537cdef6d220ecdade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(astroid) \
python39-astroid \
python3dist(astroid)"
RDEPENDS:${PN} += "python(abi) \
python39-lazy-object-proxy \
python39-typing-extensions \
python39-wrapt"

inherit rpm