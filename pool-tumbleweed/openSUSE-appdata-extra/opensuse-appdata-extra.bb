SUMMARY = "Additional Appstream Metadata"
DESCRIPTION = "This package contains extra appstream metadata to be used by appstream-builder"
LICENSE = "CC0-1.0"

PV = "1.0.1+git.20230117"

RPM_NAME = "openSUSE-appdata-extra-1.0.1+git.20230117-2.2.noarch.rpm"
RPM_HASH = "2e910c22a41ea60bf740ec407c757ef939150eb2d13682f51950130e35421670373fe1dd877e7444d5d997e960a6035852d899e51e435b9eae993024a4662812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openSUSE-appdata-extra"

RDEPENDS:${PN} += ""

inherit rpm
