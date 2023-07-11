SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python39-imbox-0.9.8-1.14.aarch64.rpm"
RPM_HASH = "173c977cc497cefac80e977ac30f09ff9fd84bb4318265e2e1febf807c2a260f00b2354506242b44fe9f63e29cf63b11eea73895cafd25a92522ac7ab69b7606"

RPROVIDES:${PN} += "python3.9dist-imbox \
python39-imbox \
python3dist-imbox"

RDEPENDS:${PN} += "python-abi \
python39-chardet"

inherit rpm
