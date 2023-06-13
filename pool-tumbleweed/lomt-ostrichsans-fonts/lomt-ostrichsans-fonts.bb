SUMMARY = "League Of Movable Type's 'Ostrich Sans' font family"
DESCRIPTION = "A modern sans-serif with a very long neck. A number of styles and \
weights are included: dashed (thin), rounded (medium), ultra light, \
normal, bold (race track style double lines) and Black10."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-ostrichsans-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "14a7a4ac22130e6de9bc5cf181655d3a03d6e199befee8fa07d0783ef57ffe776a07d1f931bd969d8acaea78f5982c3f3e17eea74456a3d204bc07b329ddda1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-ostrichsans-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
