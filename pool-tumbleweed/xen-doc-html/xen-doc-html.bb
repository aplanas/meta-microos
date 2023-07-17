SUMMARY = "Xen Virtualization: HTML documentation"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
xen-doc-html contains the online documentation in HTML format. Point \
your browser at file:/usr/share/doc/packages/xen/html/ \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_06"

RPM_NAME = "xen-doc-html-4.17.1_06-1.1.aarch64.rpm"
RPM_HASH = "307f732bf38ec22aea13c6ec6a4bab43296b9e4e73ac29c23e7e17727269fbb1f43fa4b0bb300a15ba2c416bac00a689829f4060358aaa66c2a5931eebfcc4fc"

RPROVIDES:${PN} += "xen-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
