SUMMARY = "[global] extra for python39-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [global] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python39-pytoolconfig-global-1.2.4-1.4.noarch.rpm"
RPM_HASH = "7917e52102ecd082c901a3911770e6726fcb6297e8c06cab55f6146a8a166ee525ce09f91271292b2c51a258048cfa50b50b33b02d88c4f6e9c74865320cf44f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytoolconfig-global"

RDEPENDS:${PN} += "python39-platformdirs \
python39-pytoolconfig"

inherit rpm
