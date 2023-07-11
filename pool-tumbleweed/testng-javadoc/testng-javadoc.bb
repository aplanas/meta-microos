SUMMARY = "API documentation for testng"
DESCRIPTION = "This package contains the API documentation for testng."
LICENSE = "Apache-2.0"

PV = "7.4.0"

RPM_NAME = "testng-javadoc-7.4.0-3.3.noarch.rpm"
RPM_HASH = "437ffdb74b6e563ae895e0c9ee4e1bf978c9918f68af65e18f49be49646394e65bcb934ef41bdda5061249100de1bd44f8787cecf9884a380dcfe75e2738b536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "testng-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
