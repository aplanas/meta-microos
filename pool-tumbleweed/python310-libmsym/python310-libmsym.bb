SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python310-libmsym-0.2.3-2.5.noarch.rpm"
RPM_HASH = "2f2ce20dded8deea57036e83f8133064a9e1082a7f9cbc0923bdeedbee4a50506315664bf2dd5bcac66322630fc78dabfd90547f7231fa314113c1477829a39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libmsym \
python3.10dist-libmsym \
python310-libmsym \
python3dist-libmsym"

RDEPENDS:${PN} += "python-abi"

inherit rpm
