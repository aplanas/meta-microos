SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-demo-2.5.1-28.6.noarch.rpm"
RPM_HASH = "cf7ac5600de3944d0f889bffcd19c61d40176792318e0e88f8e1d7db34cda4acae80ae5db424cd423ca172ec51e133973af29eb7d6fed073ac41bb72b24bec82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2-demo"

RDEPENDS:${PN} += ""

inherit rpm
