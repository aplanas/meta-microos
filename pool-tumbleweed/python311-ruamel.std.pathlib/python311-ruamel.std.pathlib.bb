SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-ruamel.std.pathlib-0.9.2-2.4.noarch.rpm"
RPM_HASH = "d6942f557a59cdd2c5dc411d9f1778f4f2b764ccaf4b788fa61583bdf1231a7ae5c45c4a12275f4ed9bc7ccad519599e026769e55a994aec0064eb829d7188ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.std.pathlib \
python3.11dist-ruamel.std.pathlib \
python311-ruamel.std.pathlib \
python3dist-ruamel.std.pathlib"

RDEPENDS:${PN} += "python-abi \
python311-ruamel.base"

inherit rpm
