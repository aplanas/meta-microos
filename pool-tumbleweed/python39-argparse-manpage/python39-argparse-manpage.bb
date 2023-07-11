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

RPM_NAME = "python39-argparse-manpage-4.3-1.1.noarch.rpm"
RPM_HASH = "908b52f5a146d2f93a940f6acb10c68d07b38afbca3ffff6b528a739cc61966b153985d27e49c2d5fbdbfcd37ca47a28c77af95c037feeb9f9997f1bad074d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-argparse-manpage \
python39-argparse-manpage \
python3dist-argparse-manpage"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
python39-tomli \
update-alternatives"

inherit rpm
