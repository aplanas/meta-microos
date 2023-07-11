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

RPM_NAME = "python311-AnyQt-0.2.0-2.1.noarch.rpm"
RPM_HASH = "5f99965c444c173f182f204c11e526f4a4cd21726a57bd8a057bb56293149be1ae152062073c6373d1352769041d078da3051e9eed18770c39f8188d8d683cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-AnyQt \
python3.11dist-anyqt \
python311-AnyQt \
python3dist-anyqt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
