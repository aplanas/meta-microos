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

PV = "4.17.1_04"

RPM_NAME = "xen-doc-html-4.17.1_04-1.1.aarch64.rpm"
RPM_HASH = "e0567d4bda60d4989934c5421cb7e2647be4dbff8197e22df61bcee676a72b08c7be68a2358eefcbfe68b7f5b299d06a2a2c9edefb1570e9302c2641c7845f71"

RPROVIDES:${PN} += "xen-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
