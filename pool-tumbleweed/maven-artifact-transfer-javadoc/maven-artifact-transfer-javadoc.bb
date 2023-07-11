SUMMARY = "API documentation for maven-artifact-transfer"
DESCRIPTION = "This package provides API documentation for maven-artifact-transfer."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-javadoc-0.13.1-1.9.noarch.rpm"
RPM_HASH = "11c7bce87dd3229b13a187aee36b35e55fd27e3660afcf0444c70a9ada0dfa2bf1f32e0415951ac98ee70dddbd83c5d52df490d52deeb6be31807fc5fd74d713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-transfer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
