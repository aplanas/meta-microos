SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "python311-safe-netrc-1.0.0-1.6.noarch.rpm"
RPM_HASH = "99f44f4f8bdbbfe0afc5ffd6fcd0029004d21c47b31721a73fbdb576ff5df705a43f0fb4013779d40cf77f0f943f363bfaef69bfacd51ef78de8060476d3f1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-safe-netrc \
python3.11dist-safe-netrc \
python311-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
