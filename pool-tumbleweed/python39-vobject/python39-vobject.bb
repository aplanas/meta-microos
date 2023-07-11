SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.6.1"

RPM_NAME = "python39-vobject-0.9.6.1-3.1.noarch.rpm"
RPM_HASH = "efd33cf7b8492a495c0d7fc7a4e135b69cd1ffe5c799f5a555255d6b0399a282c487651f306d524cf5739dce79b7de46df29adb3740e7091285f41d8dafec127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vobject \
python39-vobject \
python3dist-vobject \
vobject"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-six \
update-alternatives"

inherit rpm
