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

RPM_NAME = "python39-AnyQt-0.2.0-2.1.noarch.rpm"
RPM_HASH = "7ab7690312850e6dcdb0b5c167eb05549042f38d2b862fcfe946ef20dd9ae20968218632ccff7229ba98a946088bda4cee4399c78bb1edd6a06bb598106d92a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anyqt \
python39-AnyQt \
python3dist-anyqt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
