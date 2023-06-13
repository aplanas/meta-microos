SUMMARY = "Anti-spam plugin for Pidgin"
DESCRIPTION = "Pidgin Privacy Please is an anti-spam plugin for the Pidgin instant \
messenger. It offers the following features: \
 * Block individual users. \
 * Auto-reply to blocked messages. \
 * Block messages from people who are not on your contact list \
   (with an optional auto-reply). \
 * Block messages using regular expressions, either against the \
   message sender, the message content, or both. \
 * Suppress repeated/all authorisation requests. \
 * Suppress ICQ/AIM authorisation requests. \
 * Suppress authorisation requests that contain hyperlinks. \
 * Automatically show user info on authorisation requests. \
 * Block jabber headline messages. \
 * Block AOL system messages. \
 * Challenge-response bot-check."
LICENSE = "GPL-3.0+"

PV = "0.7.1"

RPM_NAME = "pidgin-plugin-privacy-please-0.7.1-1.25.aarch64.rpm"
RPM_HASH = "a0c3234d3db7188367089bd9b17252286f8a47eb0567f0427ab0d5f62c33530d97f80b47882dbb096875d5c83ea40c26787c96b506cc2070c4fae14fa8987d2a"

RPROVIDES:${PN} += "libpidgin_pp.so()(64bit) \
pidgin-plugin-privacy-please \
pidgin-plugin-privacy-please(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpurple.so.0()(64bit) \
pidgin"

inherit rpm
