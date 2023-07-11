SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-executing-1.2.0-2.3.noarch.rpm"
RPM_HASH = "e22da4fc66a98030da08b635ece40247d552d42b7c8ac73e2126290bb13d8aaaa1751717f1823adb5d0fa75acafd94a3a90b6ab77f5f048d6254481f254d6f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-executing \
python3.11dist-executing \
python311-executing \
python3dist-executing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
