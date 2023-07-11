SUMMARY = "Modified Kr Sphinx doc theme"
DESCRIPTION = "This theme is a modified 'Kr' Sphinx theme from @kennethreitz \
(especially as used in his Requests project), which was itself \
originally based on @mitsuhiko's theme used for Flask & related \
projects."
LICENSE = "BSD-3-Clause"

PV = "0.7.13"

RPM_NAME = "python39-alabaster-0.7.13-2.2.noarch.rpm"
RPM_HASH = "4c8af9823c38b826b1359966cedcf02b639243beb2459457fa5e709f61fc97b99a8eeb03bef8872e0b8a751ba678bcf00b7cbd0b209144626c0ff595f12b7680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-alabaster \
python39-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
