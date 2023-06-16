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

RPM_NAME = "python39-Send2Trash-1.8.0-1.9.noarch.rpm"
RPM_HASH = "db2b35cf3dc806db89de1a474844bff2547902cae11600f9adcabf86a7b0df23357e4740b40bc91de3a842536d0e6720f05e125d7707a3de0764cc558e3c8c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-send2trash \
python39-Send2Trash \
python3dist-send2trash"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
typelib-GObject \
typelib-Gio \
update-alternatives"

inherit rpm
