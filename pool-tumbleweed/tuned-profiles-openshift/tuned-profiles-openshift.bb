SUMMARY = "Additional tuned profile(s) optimized for the OpenShift platform"
DESCRIPTION = "Additional 3 profiles for the Openshift platform: \
A parent profile containing tuning shared by OpenShift control plane and worker nodes. \
One profile optimized for OpenShift control plane. \
And a third profile optimized for general workloads on OpenShift worker nodes."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-openshift-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "720a283ea42e9a87e9849d28a73990e287ecd911dc8f341982191560e0b36981b112ce44689449edb945e58d3d072ed68c02b6f489a60498d8ffd9f4f19cf57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-openshift"

RDEPENDS:${PN} += "tuned"

inherit rpm
