SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python311-mplcursors-0.5.2-1.5.noarch.rpm"
RPM_HASH = "4e0f4622386582bb89c812facd42517a53d54484ff54582e464164ba5db66193d0287a237bb7ca6110113f17874986af8b489dc4504dca0afc29cb18d9fe20da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mplcursors \
python3.11dist-mplcursors \
python311-mplcursors \
python3dist-mplcursors"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib"

inherit rpm
