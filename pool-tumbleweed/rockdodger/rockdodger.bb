SUMMARY = "Addictive rock-dodging greeblie-killing platform game"
DESCRIPTION = "Addictive rock-dodging greeblie-killing platform game. \
 \
Dodge the rocks for as long as possible until you die. Kill greeblies to \
make the universe safe for non-greeblie life once again."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "rockdodger-1.1.4-1.11.aarch64.rpm"
RPM_HASH = "27159896f7a129d6362a71a5bbf9419f17baa6360171087ab29181e86daa27747396bda7d7141d169ee86f35a82e9919c52c464351e3dd7d6187437417fe7115"

RPROVIDES:${PN} += "application() \
application(rockdodger.desktop) \
rockdodger \
rockdodger(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
