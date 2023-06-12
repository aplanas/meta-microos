SUMMARY = "Web based remote system managemet"
DESCRIPTION = "Packages required to run the Cockpit system management service. \
For the web service the cockpit-ws container is required."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cockpit-5.0-70.1.aarch64.rpm"
RPM_HASH = "b62c99433d59d3099f8985cb3257543f162dda8717d988e038af093ed2993f93d5fc3f254c910cca6bb78a4a7b85acfd15cb76994cc03e62ddf08b26851b4030"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-microos-cockpit \
patterns-microos-cockpit(aarch-64)"
RDEPENDS:${PN} += "(cockpit-packagekit if patterns-microos-base-packagekit) \
cockpit-podman \
cockpit-system"

inherit rpm
