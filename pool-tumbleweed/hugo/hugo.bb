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

PV = "0.115.1"

RPM_NAME = "hugo-0.115.1-1.1.aarch64.rpm"
RPM_HASH = "83fe8ac0042ae814e3211beddb9f2835efb893a3fd136ddbbba45a175a0d5ce97fd3634f3ea6059a8f024b894faf9a9d1c2f69929d2301b730bec12a4d576c2b"

RPROVIDES:${PN} += "hugo"

RDEPENDS:${PN} += "libc.so.6 \
libsass-3.6.5.so.1 \
libwebp.so.7"

inherit rpm
