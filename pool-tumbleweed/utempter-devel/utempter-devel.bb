SUMMARY = "Development files for utempter"
DESCRIPTION = "Utempter is a privileged helper for utmp and wtmp updates.  This \
package contains the development files needed."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "utempter-devel-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "febd096eba32cced6e39991e788199ae1a31bea76b81024bbdc1549b3e8f86b0cff9427cbd06d46e1023af76cc63083d6c3928ea540ab37bb0be8ba192070857"

RPROVIDES:${PN} += "utempter-devel"

RDEPENDS:${PN} += "libutempter0"

inherit rpm
