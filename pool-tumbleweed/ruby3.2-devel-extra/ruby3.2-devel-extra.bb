SUMMARY = "Special development files of ruby, normally not installed"
DESCRIPTION = "Development files to link against Ruby."
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-devel-extra-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "96580a7803271b9005cafb9663d2fdbe8095ebe804054d80b53396f78669cfd0f548d45b3e7fe50dbd15145fe390accdab80c2e8005e58c47877a1c515a0f9f6"

RPROVIDES:${PN} += "ruby3.2-devel-extra"

RDEPENDS:${PN} += "ruby3.2-devel"

inherit rpm
