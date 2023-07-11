SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python311-imbox-0.9.8-1.14.aarch64.rpm"
RPM_HASH = "a7478170b24a1f800f7e706115b2f66582126f18d6829c4579a5465dd1d3c84d456b7102fedd16c06773884fd48f7f06a504f26a30d33b1086b477c1ef97691c"

RPROVIDES:${PN} += "python3-imbox \
python3.11dist-imbox \
python311-imbox \
python3dist-imbox"

RDEPENDS:${PN} += "python-abi \
python311-chardet"

inherit rpm
