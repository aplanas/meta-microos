SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "python311-safe-netrc-1.0.0-1.4.noarch.rpm"
RPM_HASH = "0e6eeb88447dd54ffc29989c310f3422e3074a16226a4bb5588cc06787f8b59fd195004f0f7959b8b54618f07d752dff613cb8a30bcc5209216874884f4d2839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-safe-netrc \
python311-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
