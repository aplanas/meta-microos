SUMMARY = "HTML documentation and examples for python-rtmidi"
DESCRIPTION = "Contains HTML documentation and examples for python-rtmidi."
LICENSE = "MIT"

PV = "1.4.9"

RPM_NAME = "python311-python-rtmidi-doc-1.4.9-3.1.noarch.rpm"
RPM_HASH = "e190348b70b683d232ed1683f02104f44daa3034e399e60e7258c81508159550f703c9f80f304a8f6bc8537134987f76010a14bc0678934cec60161186d279e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-rtmidi-doc \
python311-python-rtmidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
