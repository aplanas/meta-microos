SUMMARY = "PyQt4/PyQt5 compatibility layer"
DESCRIPTION = "PyQt4/PyQt5 compatibility layer. \
 \
Features include: \
 \
* At the top level, AnyQt exports a Qt5 compatible module namespace along with \
  some minimal renames to better support portability between different \
  versions. \
* The 'QT_API' environment variable controls which Qt API/backend is used. \
* The API can be chosen/forced programmatically (as long as no \
  PyQt4/PyQt5/PySide was already imported). \
* An optional compatibility import hook that denies imports from \
  conflicting Qt APIs, or intercepts and fakes Qt4 API imports to use a Qt5 \
  compatible API (some monkey patching is involved)."
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python39-AnyQt-0.2.0-1.3.noarch.rpm"
RPM_HASH = "48ce7c38a99e268ac6654dae293fe43a5943184d9bbe184f3d798b97b487592a24b53f8dff2b85e5a5400d57fc0cb47966cacf633a860677a84464f737c8a2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(anyqt) \
python39-AnyQt \
python3dist(anyqt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
