SUMMARY = "Documentation files for MyGNUHealth"
DESCRIPTION = "This package includes the documentation for MyGNUHealth Personal Health \
Information Management System for Desktop and Mobile Devices"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "mygnuhealth-doc-1.0.5-2.7.noarch.rpm"
RPM_HASH = "24896f8a10bb9d5d6aaeb35d24caadc044bd476a92c736f8707bd24d61ea930dc06ba988c63e2addedbf21aa81e1ef76f7d5051c297725f446adb668e28ef73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mygnuhealth-doc"

RDEPENDS:${PN} += ""

inherit rpm
