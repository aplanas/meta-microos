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

RPM_NAME = "python311-AnyQt-0.2.0-1.3.noarch.rpm"
RPM_HASH = "18167ae1a85d7f5cf153d57fd201417a25a32b95b524dc6621b8a409e80a60fbf75d23993a7c7568efac99bd5dd2d358ffc42844830063e93d4ed6c3bd3c8c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(anyqt) \
python311-AnyQt \
python3dist(anyqt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
