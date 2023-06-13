SUMMARY = "Off-The-Record messaging plugin for irssi"
DESCRIPTION = "This plugin adds Off-the-Record messaging support for the irssi IRC client. \
Although primarily designed for use with the bitlbee IRC2IM gateway, it \
works within any query window, provided that the conversation partner's IRC \
client supports OTR. \
 \
OTR allows you to have private conversations over IM by providing: \
 \
 - Encryption \
   - No one else can read your instant messages. \
 - Authentication \
   - You are assured the correspondent is who you think it is. \
 - Deniability \
   - The messages you send do _not_ have digital signatures that are \
     checkable by a third party.  Anyone can forge messages after a \
     conversation to make them look like they came from you.  However, \
     _during_ a conversation, your correspondent is assured the messages \
     he sees are authentic and unmodified. \
 - Perfect forward secrecy \
   - If you lose control of your private keys, no previous conversation \
     is compromised."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "irssi-otr-1.0.2-2.2.aarch64.rpm"
RPM_HASH = "dbe20e989fc2aa9b00a24db69d61fa250d3052b28ac8664756134e1c2b3d00c6d569eaad2d0d393d9fa8506a86315fb334b5b3f5d0fda67b4560c59de835132b"

RPROVIDES:${PN} += "irssi-otr \
irssi-otr(aarch-64) \
libotr.so()(64bit)"

RDEPENDS:${PN} += "irssi \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
libotr.so.5()(64bit)"

inherit rpm
