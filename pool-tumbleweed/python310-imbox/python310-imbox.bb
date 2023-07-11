SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python310-imbox-0.9.8-1.14.aarch64.rpm"
RPM_HASH = "ac7eb0b6b1bc72c61fe350bef8efc3daa95cd15ddda65312c6a60a4b7c91e822e19aac97c8f87b1ee890c4989733d97254319ddc8cb076be9d0d859c9b8b32df"

RPROVIDES:${PN} += "python3.10dist-imbox \
python310-imbox \
python3dist-imbox"

RDEPENDS:${PN} += "python-abi \
python310-chardet"

inherit rpm
