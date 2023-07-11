SUMMARY = "'Off The Record' messaging library toolkit"
DESCRIPTION = "Off-the-Record (OTR) Messaging allows you to have private conversations \
over instant messaging by providing: Encryption No one else can read \
your instant messages. Authentication You are assured the correspondent \
is who you think it is. Deniability The messages you send do not have \
digital signatures that are checkable by a third party. Anyone can \
forge messages after a conversation to make them look like they came \
from you. However, during a conversation, your correspondent is assured \
the messages he sees are authentic and unmodified. Perfect forward \
secrecy If you lose control of your private keys, no previous \
conversation is compromised."
LICENSE = "GPL-2.0-only"

PV = "4.1.1"

RPM_NAME = "libotr-tools-4.1.1-4.3.aarch64.rpm"
RPM_HASH = "ff5fb8f58663e661aeaa29665da74916a9d955d85f3ce1641278fc6d71821056e9ecc66d5319d00b15624c814ecdf560e538664d858f9e731161d0ed9edfcaa7"

RPROVIDES:${PN} += "libotr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libotr.so.5"

inherit rpm
