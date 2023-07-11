SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "python311-feedgen-0.9.0-2.14.noarch.rpm"
RPM_HASH = "527db6879d9fa8654401b1b7449e0223e7b7d8be2367c79f238c6c59b6cdc0641b02a91ff9ffee0ad81ee490cae3caa8db57f5a18cf6b20820da8e424877eb40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedgen \
python3.11dist-feedgen \
python311-feedgen \
python3dist-feedgen"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-python-dateutil"

inherit rpm
