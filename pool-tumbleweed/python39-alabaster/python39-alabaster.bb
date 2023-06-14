SUMMARY = "Modified Kr Sphinx doc theme"
DESCRIPTION = "This theme is a modified 'Kr' Sphinx theme from @kennethreitz \
(especially as used in his Requests project), which was itself \
originally based on @mitsuhiko's theme used for Flask & related \
projects."
LICENSE = "BSD-3-Clause"

PV = "0.7.13"

RPM_NAME = "python39-alabaster-0.7.13-2.1.noarch.rpm"
RPM_HASH = "586c8d520aad55b50bbe1bb0b667a40e7646c9676f8d09274e6ef908813963d4c44a37043ac4d93f2c4b2fd8ff5f28b10101e157b6d09ee9650b3542fe0ff9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-alabaster \
python39-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
