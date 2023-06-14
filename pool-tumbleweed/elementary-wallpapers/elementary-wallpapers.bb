SUMMARY = "The desktop backgrounds from Pantheon"
DESCRIPTION = "This package contains quality desktop backgrounds assembled by Elementary UX."
LICENSE = "CC-BY-NC-SA-2.0"

PV = "5.5.0"

RPM_NAME = "elementary-wallpapers-5.5.0-1.10.noarch.rpm"
RPM_HASH = "ac0af2c1d0401d1e00f5334ded63246fe65c92987fea91d032726b7b420f2daa60c54eba962a1896e57d5584ccfc9b901e02e2856f54e2c171700678feb2076b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-wallpapers \
pantheon-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
