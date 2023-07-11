SUMMARY = "Python currency and money classes"
DESCRIPTION = "Provides Currency and Money classes for use in your Python code."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python310-py-moneyed-3.0-1.5.noarch.rpm"
RPM_HASH = "7cfd3f8d768d117546a77290d0ab2d1489a4e9f7545a7127ab4648202bcc64054f2bad7f456c1342fe76a99e65865d6e9559e8d01481938ce4d9a08202b843aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-moneyed \
python310-py-moneyed \
python3dist-py-moneyed"

RDEPENDS:${PN} += "python-abi \
python310-Babel \
python310-typing-extensions"

inherit rpm
