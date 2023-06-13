SUMMARY = "A Multiplatform Word Processor"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5"

RPM_NAME = "abiword-3.0.5-2.9.aarch64.rpm"
RPM_HASH = "49ba3b54802f8019f93c9bfe678c7fe975c3e427aff1ab1c048f3ea1da2e78b3fad32867c9d644a1212f04c40a9f76ed7adee24680925ea04bfdbe87268bb9a5"

RPROVIDES:${PN} += "abiword \
abiword(aarch-64) \
application() \
application(abiword.desktop) \
metainfo() \
metainfo(abiword.appdata.xml) \
mimehandler(application/docbook+xml) \
mimehandler(application/msword) \
mimehandler(application/rtf) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/vnd.oasis.opendocument.text-template) \
mimehandler(application/vnd.oasis.opendocument.text-web) \
mimehandler(application/vnd.plain) \
mimehandler(application/vnd.stardivision.writer) \
mimehandler(application/vnd.sun.xml.writer) \
mimehandler(application/vnd.wordperfect) \
mimehandler(application/wordperfect5.1) \
mimehandler(application/wordperfect6) \
mimehandler(application/x-abicollab) \
mimehandler(application/x-abiword) \
mimehandler(application/x-crossmark) \
mimehandler(application/x-t602) \
mimehandler(application/xhtml+xml) \
mimehandler(text/html) \
mimehandler(text/plain) \
mimehandler(text/vnd.wap.wml) \
mimehandler(text/x-abiword) \
mimehandler(text/x-xml-abiword)"

RDEPENDS:${PN} += "libabiword-3.0.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
