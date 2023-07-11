SUMMARY = "Documentation for the Parma Polyhedra Library"
DESCRIPTION = "This package contains all the documentations required by programmers \
using the Parma Polyhedra Library (PPL). Install this package if you \
want to program with the PPL."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-doc-1.2-3.2.noarch.rpm"
RPM_HASH = "3a7fdd8d8c66166e5f1fd516e54f50be515f37444d996e8a75598e9f5a5baad0e6c26c3e41cb2c6494e6a56b37cee075fab3657c51485775eb23b79d2d86cad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ppl-doc"

RDEPENDS:${PN} += ""

inherit rpm
