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

RPM_NAME = "libotr-tools-4.1.1-4.2.aarch64.rpm"
RPM_HASH = "2002f6f624a564e4dcec5e917308035b1d2a1e30e98f5c0a42e970138ba4b72cc3745e25f4c2ade46256d5e7c21a748c7a34f064123f2470a5b6a5c4c8f2761a"

RPROVIDES:${PN} += "libotr-tools \
libotr-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libotr.so.5()(64bit)"

inherit rpm
