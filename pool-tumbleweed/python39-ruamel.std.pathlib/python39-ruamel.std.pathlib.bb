SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-ruamel.std.pathlib-0.9.2-2.4.noarch.rpm"
RPM_HASH = "478fbe7172b3be189517e79e577a30a3b7e3a851bbe4122e2f84c02a4fb7c96988923751adb8678c139bb162dc1cdce0e8defd9f980b724fb1a92e354fb21424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ruamel.std.pathlib \
python39-ruamel.std.pathlib \
python3dist-ruamel.std.pathlib"

RDEPENDS:${PN} += "python-abi \
python39-ruamel.base"

inherit rpm
