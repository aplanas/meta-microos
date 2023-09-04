SUMMARY = "Static archives for SELinux's policy management library"
DESCRIPTION = "The libsemanage-devel-static package contains the static libraries \
needed for developing applications that manipulate binary policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-devel-static-3.5-2.1.aarch64.rpm"
RPM_HASH = "7b9de85b890ba234561d199b0b3e5ba96ef8721daed368a6aded5bddb917cf65bdcc56c79b43bb8492b3230e69d8b5209d686e92912303e39ea83c04e3ca367a"

RPROVIDES:${PN} += "libsemanage-devel-static"

RDEPENDS:${PN} += "libsemanage-devel"

inherit rpm
