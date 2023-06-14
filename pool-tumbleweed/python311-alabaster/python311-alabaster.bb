SUMMARY = "Modified Kr Sphinx doc theme"
DESCRIPTION = "This theme is a modified 'Kr' Sphinx theme from @kennethreitz \
(especially as used in his Requests project), which was itself \
originally based on @mitsuhiko's theme used for Flask & related \
projects."
LICENSE = "BSD-3-Clause"

PV = "0.7.13"

RPM_NAME = "python311-alabaster-0.7.13-2.1.noarch.rpm"
RPM_HASH = "f8ec56caa231419ff0b4519e68988afa175cb2e07f1c63e1529e354cc2bc24929e6f4ef8518933c511a50ad59de7bc6aad9e4adfb5008bfac1596f1e388a8a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-alabaster \
python311-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
