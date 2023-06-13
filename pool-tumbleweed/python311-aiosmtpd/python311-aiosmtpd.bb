SUMMARY = "SMTP server based on asyncio"
DESCRIPTION = "The Python standard library includes a basic SMTP server in the smtpd module, \
based on the old asynchronous libraries asyncore and asynchat. These modules \
are quite old and are definitely showing their age; asyncore and asynchat are \
difficult APIs to work with, understand, extend, and fix. \
 \
With the introduction of the asyncio module in Python 3.4, a much better way of \
doing asynchronous I/O is now available. It seems obvious that an asyncio-based \
version of the SMTP and related protocols are needed for Python 3. This project \
brings together several highly experienced Python developers collaborating on \
this reimplementation. \
 \
This package provides such an implementation of both the SMTP and LMTP protocols."
LICENSE = "Apache-2.0"

PV = "1.4.4.post2"

RPM_NAME = "python311-aiosmtpd-1.4.4.post2-1.4.noarch.rpm"
RPM_HASH = "e3fa74c39d56dc2812db2aee0cddc2ec0d2c2b5e51b89fa81168caf6bc002a14f0d968b87251d35a85f8395c2aae5f7b005b250ca9d6d484bf01a8664eca552c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aiosmtpd) \
python311-aiosmtpd \
python3dist(aiosmtpd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-atpublic \
python311-attrs \
update-alternatives \
user(nobody)"

inherit rpm
