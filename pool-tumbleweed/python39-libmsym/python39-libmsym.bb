SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python39-libmsym-0.2.3-2.5.noarch.rpm"
RPM_HASH = "d462b0cc7a38efb99594ede1334e7d0837704302c2ac5b7f9bf31a83b265097ac9a4f9276f422972344aa31da04ad36f3880fae84efd7484fc549d62f6cc8d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(libmsym) \
python39-libmsym \
python3dist(libmsym)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
