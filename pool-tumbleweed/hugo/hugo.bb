SUMMARY = "Static website generator written in Go"
DESCRIPTION = "Hugo is a static HTML and CSS website generator written in Go. It is optimized \
for speed, ease of use, and configurability, and designed to work well for any \
kind of website including blogs, tumbles, and docs. Hugo takes a directory with \
Markdown and templates and renders them into a full HTML website, typically in a \
fraction of a second. You can run Hugo from any directory, which works well for \
shared hosts and other systems where you don’t have a privileged account. Hugo \
provides a Privacy Config that can assist with General Data Protection \
Regulation (GDPR) compliance issues. \
 \
https://gohugo.io/"
LICENSE = "Apache-2.0"

PV = "0.118.2"

RPM_NAME = "hugo-0.118.2-1.1.aarch64.rpm"
RPM_HASH = "bd4b07c6d603d31f9098d8c6498c5b13ae9a94eac77408044e85bacf8c90ca9bb94b7b2a98d0b38e6593304118f6f109eea5d09af736c99191a86447b91e0301"

RPROVIDES:${PN} += "hugo"

RDEPENDS:${PN} += "libc.so.6 \
libsass-3.6.5.so.1 \
libwebp.so.7"

inherit rpm
