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

RPM_NAME = "python311-aiosmtpd-1.4.4.post2-2.1.noarch.rpm"
RPM_HASH = "d65cee251df4498ea6a00b0f84955b57b731960e1c114a14ab1d500acad6c38a478e9743f84be47098992ea855a93395686506bd633d068664d8da27921c5677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosmtpd \
python3.11dist-aiosmtpd \
python311-aiosmtpd \
python3dist-aiosmtpd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-atpublic \
python311-attrs \
update-alternatives \
user-nobody"

inherit rpm
