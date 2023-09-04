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

PV = "4.17.2_02"

RPM_NAME = "xen-doc-html-4.17.2_02-1.1.aarch64.rpm"
RPM_HASH = "79ee487af18c26015d83b5018bae31f1acd313464b3a7627ed6ef192e03cca6f17c8f195f5179624653d620288427ac8638fa7905b1a43662ae3846103fa6e75"

RPROVIDES:${PN} += "xen-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
