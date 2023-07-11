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

RPM_NAME = "xen-doc-html-4.17.1_04-1.2.aarch64.rpm"
RPM_HASH = "585cad22657fcb7093cacb28939af347252a3d24595d1d98ea1e24f467f26da1910ddbbde55085077ab59588a651c4256dd903a07c443c8e5285fea2e30fc37f"

RPROVIDES:${PN} += "xen-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
