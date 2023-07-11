SUMMARY = "Grace library"
DESCRIPTION = "Grace is a WYSIWYG 2D plotting tool for the X Window System and M*tif. \
Grace is a descendant of ACE/gr, also known as Xmgr. It knows a lot of \
different graph types and supports a lot of output formats. This devel \
package contains a library to work with grace from other applications. \
 \
For further information consult the main package."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.25"

RPM_NAME = "xmgrace-devel-5.1.25-4.7.aarch64.rpm"
RPM_HASH = "b2777ddb8bfe1efa523fa3d01f6d948f70ea0be2563b23ede4d8c1b3943b10902254f52c916ff628af22aea66c9907b2639093c8ac6871900519195f90825912"

RPROVIDES:${PN} += "xmgrace-devel"

RDEPENDS:${PN} += ""

inherit rpm
