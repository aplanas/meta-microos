SUMMARY = "Local mode for Apache Ivy (files)"
DESCRIPTION = "This package contains files needed by local mode fow Apache Ivy, which \
allows artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-ivy-6.1.0-3.2.noarch.rpm"
RPM_HASH = "9497ea8a0211dcb3ac41b3c4eccb2421b2a609422f56b8ac520dbec03da583221a8910b165ca45aebfa815f146b6a7716ade208de66bb2edde0c852b47c77a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapackages-ivy"

RDEPENDS:${PN} += "javapackages-local \
javapackages-tools"

inherit rpm
