SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-system_hotkey-1.0.3-1.17.noarch.rpm"
RPM_HASH = "8e753191e72940fe3b04adc77437a5ec139a7ea926eab888e75ef143a74616c0ba5dc4ad32eb5769429e64cf3d272b73b9154a8303da316c0b549434efcfd6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-system-hotkey \
python310-system-hotkey \
python3dist-system-hotkey"

RDEPENDS:${PN} += "python-abi \
python310-xcffib \
python310-xpybutil"

inherit rpm
