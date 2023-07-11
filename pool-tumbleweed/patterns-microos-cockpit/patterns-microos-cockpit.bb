SUMMARY = "Web based remote system managemet"
DESCRIPTION = "Packages required to run the Cockpit system management service. \
For the web service the cockpit-ws container is required."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cockpit-5.0-72.1.aarch64.rpm"
RPM_HASH = "83159da9e991f2f8fa2233f14fd2d42a36496e84b44a2f782861be6509cfe86ab53cd295edf89aff60b726857caa704e59b33513fc288394fa885555f1ae32ba"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-cockpit"

RDEPENDS:${PN} += "cockpit-podman \
cockpit-system"

inherit rpm
