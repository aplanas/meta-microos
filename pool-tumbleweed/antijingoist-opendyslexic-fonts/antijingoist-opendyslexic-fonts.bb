SUMMARY = "OpenDyslexic Fonts"
DESCRIPTION = "OpenDyslexic, a typeface that uses typeface shapes & features to help offset \
some visual symptoms of Dyslexia."
LICENSE = "OFL-1.1"

PV = "0.91.12"

RPM_NAME = "antijingoist-opendyslexic-fonts-0.91.12-1.9.noarch.rpm"
RPM_HASH = "427f699f61b5eace1cff10fb2af2e653ef169ffb134e6f560b303e297869898d3b8d869d552f5afdf2160cb4029f19c47d82882280b157b94c138f11b6d55a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antijingoist-opendyslexic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
