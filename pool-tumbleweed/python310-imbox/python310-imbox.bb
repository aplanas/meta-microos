SUMMARY = "Python IMAP for Human beings"
DESCRIPTION = "Python library for reading IMAP mailboxes and converting email content to machine readable data"
LICENSE = "MIT"

PV = "0.9.8"

RPM_NAME = "python310-imbox-0.9.8-1.12.aarch64.rpm"
RPM_HASH = "2fe6d23f35bb7fee4f50f27060f8b54d0cd7961240df11e7e6ca2f7d8b976cfdf19e6238d8319d0ba4c1c878f8bfa76dd1caa62c4f662d96444360ba61ade953"

RPROVIDES:${PN} += "python3-imbox \
python3.10dist(imbox) \
python310-imbox \
python310-imbox(aarch-64) \
python3dist(imbox)"

RDEPENDS:${PN} += "python(abi) \
python310-chardet"

inherit rpm
