SUMMARY = "Tool for automatic manual page building from a Python ArgumentParser object"
DESCRIPTION = "This utility generates a manual page in an automatic way from an \
ArgumentParser object, so the manpage 1:1 corresponds to the \
automatically generated --help output. The manpage generator needs to \
known the location of the object, user can specify that by (a) the \
module name or corresponding python filename and (b) the object name \
or the function name which returns the object. There's a limited \
support for (deprecated) optparse objects, too."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "python311-argparse-manpage-4.3-1.1.noarch.rpm"
RPM_HASH = "9dfa1e495cb85610d5d7711465d4e00995d3d8a9dc1bef050f049e7be1cadd1db14c9c16aeeeb647cba2fb5ef109b09e6e1975d83f36c6bc7aa10862aad5e1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argparse-manpage \
python3.11dist-argparse-manpage \
python311-argparse-manpage \
python3dist-argparse-manpage"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
python311-tomli \
update-alternatives"

inherit rpm
