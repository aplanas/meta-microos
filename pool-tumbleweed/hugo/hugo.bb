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

PV = "0.116.1"

RPM_NAME = "hugo-0.116.1-1.1.aarch64.rpm"
RPM_HASH = "bacf843ab6f9a5477847b05e7f10e4fee8a73a118e3e83b4232bd95e4b197f5c6fd8423d6d301047ea558f3e9daa8250991048e0f0326f11868db8549e9d34ff"

RPROVIDES:${PN} += "hugo"

RDEPENDS:${PN} += "libc.so.6 \
libsass-3.6.5.so.1 \
libwebp.so.7"

inherit rpm
