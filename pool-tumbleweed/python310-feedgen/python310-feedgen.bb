SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "python310-feedgen-0.9.0-2.14.noarch.rpm"
RPM_HASH = "fea0b9b71b713fb9a61f10b56c2d90cd88f6a4e07461a1e36e51c114e121e472ca99bb86f72ec06438b65f359aa8cb26f199338b0838cf3ebd7348012f557ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-feedgen \
python310-feedgen \
python3dist-feedgen"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-python-dateutil"

inherit rpm
