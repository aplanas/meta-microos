SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops CLIs and installing helm charts, with a single command. \
You can also download CLIs like kubectl, kind, kubectx and helm faster than you can type 'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.9.25"

RPM_NAME = "arkade-0.9.25-1.1.aarch64.rpm"
RPM_HASH = "0bf25e1c0f12922756dfad72e6664dddc4a7f697ca2d563da25fd4fa38c1d2e87342df6444034166085ff871a6f921ae44059533a57418193690103dc57455fc"

RPROVIDES:${PN} += "arkade"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
