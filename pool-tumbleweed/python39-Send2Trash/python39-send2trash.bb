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

RPM_NAME = "python39-Send2Trash-1.8.0-1.11.noarch.rpm"
RPM_HASH = "abca20da15b8e8384b3f2b3b64fac6c8ab499e49ce35b8830293123442a36486c3dfff4929d6be8b20f1a9509dd143c8d9ee1cdbed27097f02b9c3a01d963fc9"
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
