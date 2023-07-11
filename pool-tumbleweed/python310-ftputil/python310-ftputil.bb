SUMMARY = "High-level FTP client library (virtual file system and more) for Python"
DESCRIPTION = "FTPutil is a high-level FTP client library for the Python programming \
language. ftputil implements a virtual file system for accessing FTP \
servers, that is, it can generate file-like objects for remote files. \
The library supports many functions similar to those in the os, \
os.path and shutil modules. ftputil has convenience functions for \
conditional uploads and downloads, and handles FTP clients and \
servers in different timezones."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "python310-ftputil-3.4-3.17.noarch.rpm"
RPM_HASH = "d48012ded6a221711b412a4d72836bffe5892d485f8b5dd1eb00bc0cd6a88fe57fe3643910e800d4de48647e35d95a28aa6009e26f97068d0e197301c2621200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ftputil \
python310-ftputil \
python3dist-ftputil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
