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

RPM_NAME = "python310-AnyQt-0.2.0-2.1.noarch.rpm"
RPM_HASH = "11aedc89edab6f44e12a90de4af17e4974eec9cdebcb319613bc67829471de7e827c769b9ffee5ca38c0e903787e1068d8ccddba214b181de964791c975999b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-anyqt \
python310-AnyQt \
python3dist-anyqt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
