SUMMARY = "Retrying library for Python"
DESCRIPTION = "Retrying is a general-purpose retrying library, written in Python, to \
simplify the task of adding retry behavior to just about anything."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "python311-retrying-1.3.4-1.3.noarch.rpm"
RPM_HASH = "7f924780aa9b1c4d3b9d5f77ce300642fd688b30df9e97d4bf5b3ddc31b5e9c837a775a442a82854f061b71d9d4e21573ecf2e13a7be93bee9c617dedb14ee55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-retrying \
python311-retrying \
python3dist-retrying"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
