SUMMARY = "Modified Kr Sphinx doc theme"
DESCRIPTION = "This theme is a modified 'Kr' Sphinx theme from @kennethreitz \
(especially as used in his Requests project), which was itself \
originally based on @mitsuhiko's theme used for Flask & related \
projects."
LICENSE = "BSD-3-Clause"

PV = "0.7.13"

RPM_NAME = "python311-alabaster-0.7.13-2.2.noarch.rpm"
RPM_HASH = "ab6d52ffb48256f44d0e920de58ae3f56d1f0a8a71621daba2e3d796159a2bd146d6158895e582838712ef75d3585f0f2b4e1506edc6fac669d7aa888f865cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-alabaster \
python3.11dist-alabaster \
python311-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
