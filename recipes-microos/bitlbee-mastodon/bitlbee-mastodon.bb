SUMMARY = "A Mastodon plugin for Bitlbee"
DESCRIPTION = "This plugin allows Bitlbee to communicate with Mastodon instances. \
Mastodon is a free, open-source, decentralized microblogging network. \
Bitlbee is an IRC server connecting to various other text messaging \
services. You run Bitlbee and connect to it using an IRC client, then \
configure Bitlbee to connect to other services, such as a Mastodon \
instance where you already have an account. The benefit is that you can \
now use any IRC client you want to connect to Mastodon."
LICENSE = "GPL-2.0-only"

PV = "1.4.5"

RPM_NAME = "bitlbee-mastodon-1.4.5-1.7.aarch64.rpm"
RPM_HASH = "de49a94a9387bec0a36be3926cd81356ff1c9d6c98914f306d9aec81dd626c98bb208a83e4e2d3113efc73f48746e76e09b04aa1e284c6d2af1d5c4f883d2a23"

RPROVIDES:${PN} += "bitlbee-mastodon bitlbee-mastodon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
