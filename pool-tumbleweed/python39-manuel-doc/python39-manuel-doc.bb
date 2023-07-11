SUMMARY = "Build tested documentation"
DESCRIPTION = "This package contains documentation files for python39-manuel."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python39-manuel-doc-1.12.4-4.2.noarch.rpm"
RPM_HASH = "4f7e13216f81d52f86d5b4ec6c82f27744a7165aa51c77f388774c63d0adfc1f61629feaf76048811c4a09a325de71dbff13af00e12c19fa5e14df56ef727ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-manuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
