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

RPM_NAME = "viruskiller-1.03-2.24.aarch64.rpm"
RPM_HASH = "97cc1d86f556c41771ad50854cc4a73d303c1c1388a140b189f3a69bd137e61d0131445a76cc6492aba687998e2b7aba14c6cb48f74a10abc1c34ce3f42e295f"

RPROVIDES:${PN} += "viruskiller"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-net-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
