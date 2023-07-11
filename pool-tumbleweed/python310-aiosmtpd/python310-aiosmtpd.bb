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

RPM_NAME = "python310-aiosmtpd-1.4.4.post2-2.1.noarch.rpm"
RPM_HASH = "12cc90b26d950d2f54f280afef554acbff74d2f13e7a5b78ec342a4692783a1af4615027331adcb1f5a49e0634b186907e6ef33f49414e8dae2269296c88df3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiosmtpd \
python310-aiosmtpd \
python3dist-aiosmtpd"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-atpublic \
python310-attrs \
update-alternatives \
user-nobody"

inherit rpm
