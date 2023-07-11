SUMMARY = "Implements a lazy string for python useful for use with gettext"
DESCRIPTION = "A module that provides lazy strings for translations.  Basically you \
get an object that appears to be a string but changes the value every \
time the value is evaluated based on a callable you provide."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "python39-speaklater-1.3-2.16.noarch.rpm"
RPM_HASH = "7567a32ad92d21d0503338e21afeab71f5f4bd5405bd7da2c2d59d78712b7eb82408a3dfc211a6efe9b396b312749a511c22a7d7113927cc7c5c49a3d9383ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-speaklater \
python39-speaklater \
python3dist-speaklater"

RDEPENDS:${PN} += "python-abi"

inherit rpm
