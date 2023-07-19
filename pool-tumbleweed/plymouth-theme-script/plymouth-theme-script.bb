SUMMARY = "Plymouth 'Script' theme"
DESCRIPTION = "This package contains the 'script' boot splash theme for \
Plymouth. It is a simple example theme the uses the 'script' \
plugin."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-script-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "1e68074db60f1a8821124d57089c8ee95bdbc664b40dcbb842571c2162158f41e856e25fefc277f9065ef99ad6501838510ffb44aec11ad5969a6c4452188999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-script"

RDEPENDS:${PN} += "plymouth-plugin-script \
plymouth-scripts"

inherit rpm
