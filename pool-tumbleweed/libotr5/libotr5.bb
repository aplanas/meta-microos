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
LICENSE = "LGPL-2.1-only"

PV = "4.1.1"

RPM_NAME = "libotr5-4.1.1-4.3.aarch64.rpm"
RPM_HASH = "9b945147b14bbc2df80fffcbc1f6d0cfd5f4ae3edac2a1f9635ea16d35bee36d6b7fe8c00d013c6d8f95f66b4f3a2888914f2514a875ce34c5cbfa765e67fadc"

RPROVIDES:${PN} += "libotr \
libotr.so.5 \
libotr5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
