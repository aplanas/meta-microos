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

RPM_NAME = "python311-ftputil-3.4-3.17.noarch.rpm"
RPM_HASH = "048c6186b49abbeb30be12114148dfa3bffc2268b50e847f6088b73648486cd91048f86b0768b47f323180603eb6a0fd89fb7ba4b6c2f3f041d72e920444cab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ftputil \
python3.11dist-ftputil \
python311-ftputil \
python3dist-ftputil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
