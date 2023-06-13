SUMMARY = "Documentation for python-billiard"
DESCRIPTION = "Documentation and help files for python-billiard."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python-billiard-doc-4.1.0-1.3.noarch.rpm"
RPM_HASH = "3133213a7dc52e21d91666164179c663492486c858a17999c85174698ffd26f53158dcb9fdea4a1d49a8e0b377e6660472a15e4b0fd6c8db332ba348a3931fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-billiard-doc \
python2-billiard \
python310-billiard-doc \
python311-billiard-doc \
python39-billiard-doc"

RDEPENDS:${PN} += ""

inherit rpm
