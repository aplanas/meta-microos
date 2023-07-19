SUMMARY = "Kubevirt containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the Kubevirt container images."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "obs-service-kubevirt_containers_meta-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "b56dc89bdbbf2ced4d0f18e15bc1bc5a57478f5235851aa860febdd41e5ada33321e9c5bcc3aab6705984baabb04c82b363dd2bb662184b1728aa55b3996105f"

RPROVIDES:${PN} += "obs-service-kubevirt-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
