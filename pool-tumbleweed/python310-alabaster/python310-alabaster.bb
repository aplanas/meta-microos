SUMMARY = "Modified Kr Sphinx doc theme"
DESCRIPTION = "This theme is a modified 'Kr' Sphinx theme from @kennethreitz \
(especially as used in his Requests project), which was itself \
originally based on @mitsuhiko's theme used for Flask & related \
projects."
LICENSE = "BSD-3-Clause"

PV = "0.7.13"

RPM_NAME = "python310-alabaster-0.7.13-2.2.noarch.rpm"
RPM_HASH = "dfbf9808b79f65716079a69b8afc70e8d2deba8843f1c65c497e9f21ea381276f9a73aefeb05414e864ab06ea11f589d421e777cba99d4a81c3e123dd264d1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-alabaster \
python310-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
