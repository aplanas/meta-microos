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

RPM_NAME = "python310-AnyQt-0.2.0-1.3.noarch.rpm"
RPM_HASH = "d8d9b53eeb48aca74be680b6bd9633dc7baa6c4b851c11a02ce414d91434b8196c875cb30e6830c601da7a620452b8100ddf30842c1dcff762c2e34d8a6c039e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-AnyQt \
python3.10dist(anyqt) \
python310-AnyQt \
python3dist(anyqt)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
