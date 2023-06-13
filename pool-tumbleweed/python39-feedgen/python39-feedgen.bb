SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "python39-feedgen-0.9.0-2.12.noarch.rpm"
RPM_HASH = "363eda176d9d77affdde4161ebb36f191b9611d12461df8a4631add64423d05a79fc95852c6f0f13285008a9398d198cc6ec34ffc7de5a01130648e0dc4c6682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(feedgen) \
python39-feedgen \
python3dist(feedgen)"

RDEPENDS:${PN} += "python(abi) \
python39-lxml \
python39-python-dateutil"

inherit rpm
