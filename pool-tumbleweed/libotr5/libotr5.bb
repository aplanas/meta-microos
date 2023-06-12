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

RPM_NAME = "libotr5-4.1.1-4.2.aarch64.rpm"
RPM_HASH = "48484fe845a05ae4c7b1c2d0c5d4f7dc9c936ea45cc9265cbcb4efc987ff26d8bb6aedc0541c4b8fac5e4d97bc5b4f817f2101e2ef522219470c2bed7d91b02d"

RPROVIDES:${PN} += "libotr \
libotr.so.5()(64bit) \
libotr5 \
libotr5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit)"

inherit rpm
