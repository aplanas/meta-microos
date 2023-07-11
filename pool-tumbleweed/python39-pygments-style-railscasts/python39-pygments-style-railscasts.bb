SUMMARY = "Pygments version of the 'railscasts' vim theme."
DESCRIPTION = "A port of the railscasts color scheme for pygments."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python39-pygments-style-railscasts-0.3-1.18.noarch.rpm"
RPM_HASH = "bac9c45e60e8a9001769232eaa81bd035fc3391bdd81fbc5dcf7d37b083170039f4abd1ea9fb049b2b011298eb1c26172bf1ae2799ca641919577e4878ad1b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-style-railscasts \
python39-pygments-style-railscasts \
python3dist-pygments-style-railscasts"

RDEPENDS:${PN} += "python-abi \
python39-pygments"

inherit rpm
