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

PV = "0.116.0"

RPM_NAME = "hugo-0.116.0-1.1.aarch64.rpm"
RPM_HASH = "3b6b4e400f262567c63b54596c74c4fe3533ecb03b9d57c905e044030670e9e16316924eebf5f0a1f196cc572bcf89dbb596b2122d16e8a7ba88e134e8964686"

RPROVIDES:${PN} += "hugo"

RDEPENDS:${PN} += "libc.so.6 \
libsass-3.6.5.so.1 \
libwebp.so.7"

inherit rpm
