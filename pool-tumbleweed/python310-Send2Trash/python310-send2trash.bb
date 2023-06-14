SUMMARY = "Python library to send files to the Trash location"
DESCRIPTION = "Send2Trash is a small package that sends files to the Trash (or \
Recycle Bin) natively and on all platforms. On OS X, it uses native \
FSMoveObjectToTrashSync Cocoa calls, on Windows, it uses native (and \
ugly) SHFileOperation win32 calls. On other platforms, if PyGObject \
and GIO are available, it will use this. Otherwise, it will fallback \
to its own implementation of the trash specifications from \
freedesktop.org."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python310-Send2Trash-1.8.0-1.9.noarch.rpm"
RPM_HASH = "33b11ad9dcb1362fb786ff82445d9282909774b301eb25365de055ee85d793f17375cc79b46e0c479cf7551704323d583e4f9d56b81f75f0912bae599aa2aad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Send2Trash \
python3.10dist-send2trash \
python310-Send2Trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
