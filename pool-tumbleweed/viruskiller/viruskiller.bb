SUMMARY = "Arcade shoot 'em up game about virus invasion"
DESCRIPTION = "Your computer has been invaded! Dozens of little viruses are pouring \
in via security holes in Microsoft Internet Explorer, Microsoft Outlook, \
Microsoft MSN Messenger and Microsoft Recycle Bin!! Using your trusty \
mouse you must shoot the buggers before they can destroy your files! \
Some will steal them from their home directories and take them back \
to their security hole. Others will just eat them right there on \
the spot! See how long you and your computer can survive the onslaught!"
LICENSE = "GPL-2.0+"

PV = "1.03"

RPM_NAME = "viruskiller-1.03-2.23.aarch64.rpm"
RPM_HASH = "eed3ddd7ac263856e2bdbabe118c482c25951239c6cae55f553e215a7856ff741dcafb978b85cd75469b4d5af73e9967cefa1596485fc4e107c81961a48f9c22"

RPROVIDES:${PN} += "application() \
application(viruskiller.desktop) \
viruskiller \
viruskiller(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_net-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
