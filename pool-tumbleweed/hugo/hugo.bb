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

PV = "0.117.0"

RPM_NAME = "hugo-0.117.0-1.1.aarch64.rpm"
RPM_HASH = "3a9354941571188a50e605ae171fdc9b9b238692e8c7e3e75ece568d2370400c56aa67a5ec19a90bc2386ac59f10801450f75650e41cbc6b7387e97e0a35cf83"

RPROVIDES:${PN} += "hugo"

RDEPENDS:${PN} += "libc.so.6 \
libsass-3.6.5.so.1 \
libwebp.so.7"

inherit rpm
