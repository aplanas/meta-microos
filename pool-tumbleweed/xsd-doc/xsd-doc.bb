SUMMARY = "API documentation files for xsd"
DESCRIPTION = "This package contains API documentation for xsd."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "4.1.0"

RPM_NAME = "xsd-doc-4.1.0-2.1.noarch.rpm"
RPM_HASH = "db120d58eac547e28524ad01a5c691c7593740771f131716d6455b82c194b4a0ff88c12a34619b8fcb8a810aa49bc2f153d2292bef5e6d5e29728ac6a9bea73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsd-doc"

RDEPENDS:${PN} += "xsd"

inherit rpm
