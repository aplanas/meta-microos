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

RPM_NAME = "python311-ftputil-3.4-3.15.noarch.rpm"
RPM_HASH = "3fb65be48bc95dbc59a2b8b91a5421efb0d7a1cf42f2a47f4747e82f8f7d61fe4ffb9c989b8f0e14a35701d2c2bfe8c5814cd0e289747d8b89fda3a9afdc1b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ftputil \
python311-ftputil \
python3dist-ftputil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
