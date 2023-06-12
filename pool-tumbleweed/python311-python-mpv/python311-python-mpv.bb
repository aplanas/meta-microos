SUMMARY = "Python interface to the mpv media player"
DESCRIPTION = "A ctypes-based python interface to the mpv media player. \
It gives more or less full control of all features of the player, \
just like the lua interface does."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "python311-python-mpv-1.0.3-2.2.noarch.rpm"
RPM_HASH = "bb253f613a8f98f89ecfd15675d9cd8e4191bee0938ed67991bdd5eb22177aa3f1871c1a7323921d81ac8b41bf36e9a2b5cde73062e716afddc78148b351b624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-mpv) \
python311-python-mpv \
python3dist(python-mpv)"
RDEPENDS:${PN} += "libmpv2 \
python(abi)"

inherit rpm
