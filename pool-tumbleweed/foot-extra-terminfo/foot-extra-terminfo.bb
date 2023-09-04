SUMMARY = "Extra terminfo files for the foot terminal emulator"
DESCRIPTION = "This package contains extra terminfo files for the foot terminal emulator \
that provide more features than the files in the terminfo-base package. \
Set term=foot-extra or term=foot-extra-direct in foot.ini to \
take advantage of the files in this package."
LICENSE = "MIT"

PV = "1.15.3"

RPM_NAME = "foot-extra-terminfo-1.15.3-1.1.noarch.rpm"
RPM_HASH = "bf69e959d8c101ff627d4474a9753578fada6ae480891e9207368f37ea747f11e32e00af68ce661650bb1c0660a678eaca6b93282fb829c961da0e123774b91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-extra-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
