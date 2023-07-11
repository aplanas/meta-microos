SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python310-rarfile-4.0-3.7.noarch.rpm"
RPM_HASH = "7a4dacd574c051bb1f78f6adb390854a755837e3b928a7c08f74ae0d8a758db10e2754860871b0b830a6b199c495dafdd08f13b0c44d5cf2165414b856d0c551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rarfile \
python310-rarfile \
python3dist-rarfile"

RDEPENDS:${PN} += "bsdtar \
python-abi"

inherit rpm
