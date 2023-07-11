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

RPM_NAME = "python39-ftputil-3.4-3.17.noarch.rpm"
RPM_HASH = "7997283641ca4e71a96719fb8418362477ddb786a81272ece7fe1938abdabaa933f28139709b4ef8fc164300411e9745de5060fe0480e6a97f2c224aaa967737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ftputil \
python39-ftputil \
python3dist-ftputil"

RDEPENDS:${PN} += "python-abi"

inherit rpm
