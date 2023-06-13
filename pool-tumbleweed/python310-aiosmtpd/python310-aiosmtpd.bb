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

RPM_NAME = "python310-aiosmtpd-1.4.4.post2-1.4.noarch.rpm"
RPM_HASH = "3a2ddade95fcd18bd9cd4dccd7e93791e2a89081629b4979a33ff00d3eec0770d8fe62b058113228cca4ef2a3974ec7a09cb4008834a59621f38c7ea84f2bf2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosmtpd \
python3.10dist(aiosmtpd) \
python310-aiosmtpd \
python3dist(aiosmtpd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-atpublic \
python310-attrs \
update-alternatives \
user(nobody)"

inherit rpm
