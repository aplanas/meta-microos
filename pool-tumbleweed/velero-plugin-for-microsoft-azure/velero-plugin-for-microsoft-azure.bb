SUMMARY = "Velero plugin for Microsoft Azure"
DESCRIPTION = "Plugins to support Velero on Microsoft Azure"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "velero-plugin-for-microsoft-azure-1.4.0-1.7.aarch64.rpm"
RPM_HASH = "24931d298ca54fd138aa90ee4453e00ba63a8c3366100a923e947aef1d95e53fdb018712daf343e5790a1d3d9411bf3b4d0eb838b9ed8f5bf709a179a66c7fdf"

RPROVIDES:${PN} += "velero-plugin-for-microsoft-azure"

RDEPENDS:${PN} += ""

inherit rpm
