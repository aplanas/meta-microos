SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "python39-feedgen-0.9.0-2.14.noarch.rpm"
RPM_HASH = "d3cc7d83b2ec4fb2b5d0a6dc1f7b32bb11e1569c25fb5c160d560d4e2548828b10c4770c38265d412aeb7281ae22c8e6602416cabc737d1046e3360ae4f279fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-feedgen \
python39-feedgen \
python3dist-feedgen"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-python-dateutil"

inherit rpm
