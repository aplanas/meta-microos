SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python39-ZConfig."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python39-ZConfig-doc-3.6.1-1.3.noarch.rpm"
RPM_HASH = "75eeafa91b54bff9ab0645308dc2cd2364e25f112d4214e3816adb22396250596d9e19fb06511e02b1520102a68bac1aecad5b74ad2aba05c2ac712df0d0ddd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ZConfig-doc"

RDEPENDS:${PN} += "python39-ZConfig"

inherit rpm
