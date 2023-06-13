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

RPM_NAME = "python39-aiosmtpd-1.4.4.post2-1.4.noarch.rpm"
RPM_HASH = "e57636cf8553b337644425fa95402b9b4739811768e69f13a1390c72ecea5a3e8aa257a636f7d3726b2a60c07ef5f86d838d260fbacd092309486cf8bf7b3b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiosmtpd) \
python39-aiosmtpd \
python3dist(aiosmtpd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-atpublic \
python39-attrs \
update-alternatives \
user(nobody)"

inherit rpm
