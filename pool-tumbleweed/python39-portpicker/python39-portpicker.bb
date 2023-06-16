SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python39-portpicker-1.5.2-1.5.noarch.rpm"
RPM_HASH = "7f63eea4d2856ab1c8f7fdb112878ecf4ee6a011860071d42d1490367dce82d03e06d0c7aaeec2ceded9a2062962829c53f2d2d5eecdfd02cb8da2edb0a9b5de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-portpicker \
python39-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
