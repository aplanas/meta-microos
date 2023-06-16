SUMMARY = "Tool for automatic manual page building from a Python ArgumentParser object"
DESCRIPTION = "This utility generates a manual page in an automatic way from an \
ArgumentParser object, so the manpage 1:1 corresponds to the \
automatically generated --help output. The manpage generator needs to \
known the location of the object, user can specify that by (a) the \
module name or corresponding python filename and (b) the object name \
or the function name which returns the object. There's a limited \
support for (deprecated) optparse objects, too."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "python311-argparse-manpage-4.1-1.1.noarch.rpm"
RPM_HASH = "fe5bf27975e902c75841934fa0d94a1df5842bff375f4a6069b32d27e4aa6b9b7f028e91e18962fa443ba9e0bfba469fd1acd6418575ee1408668f75014bd600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-argparse-manpage \
python311-argparse-manpage \
python3dist-argparse-manpage"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
