SUMMARY = "Pinyin library for libime"
DESCRIPTION = "This package provides pinyin library for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.17"

RPM_NAME = "libIMEPinyin0-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "901ddd23bcf2966ec767192b7b4b2b56e3a3a7952a03575b212565b766a0bca6ab942e393f85b2be120ecbfe7e1c6531e6bdbe88916a1f51e3995922c151573a"

RPROVIDES:${PN} += "libIMEPinyin.so.0 \
libIMEPinyin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libime-dicts \
libstdc++.so.6"

inherit rpm
