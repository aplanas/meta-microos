SUMMARY = "Javadoc for lightcouch"
DESCRIPTION = "This package contains javadoc for lightcouch."
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "lightcouch-javadoc-0.2.0-1.8.noarch.rpm"
RPM_HASH = "e9815d9b18ca9bf434cd74b3872b91ce2460291afd0cde1e3ab2bd8f595eb50a987db805f06037b1ecdbc70e7365dae5e952343cfa587bbd12142b444e4288a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightcouch-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
