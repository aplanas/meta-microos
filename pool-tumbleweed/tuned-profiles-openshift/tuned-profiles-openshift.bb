SUMMARY = "Additional tuned profile(s) optimized for the OpenShift platform"
DESCRIPTION = "Additional 3 profiles for the Openshift platform: \
A parent profile containing tuning shared by OpenShift control plane and worker nodes. \
One profile optimized for OpenShift control plane. \
And a third profile optimized for general workloads on OpenShift worker nodes."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-openshift-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "f6d009d3fb41c66f9559dd4de3ebee596dcc329a3dd48b258486b6bc92193b7999cebbb69fb5d2f659c2bd7c47065f17d322226ad5c4f5fe4236402a8999cef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-openshift"

RDEPENDS:${PN} += "tuned"

inherit rpm
