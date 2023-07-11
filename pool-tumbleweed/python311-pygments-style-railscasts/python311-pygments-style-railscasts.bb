SUMMARY = "Pygments version of the 'railscasts' vim theme."
DESCRIPTION = "A port of the railscasts color scheme for pygments."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python311-pygments-style-railscasts-0.3-1.18.noarch.rpm"
RPM_HASH = "7dc522fd09e9c08925e8e1f096190d6cbebebf2ee943efac6cfe7c3b2f11ebd12624311f9b09d28e557f6d3310a3659c0e2eacafb75ab46f4691811df20dcc9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-style-railscasts \
python3.11dist-pygments-style-railscasts \
python311-pygments-style-railscasts \
python3dist-pygments-style-railscasts"

RDEPENDS:${PN} += "python-abi \
python311-pygments"

inherit rpm
