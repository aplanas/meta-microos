SUMMARY = "Wraps OBS docker/kiwi-built images in rpms"
DESCRIPTION = "OBS container_post_run hook to wrap a kiwi or docker image in an rpm package. \
 \
This package should be required by the Build Service project's meta \
prjconf, so that the container_post_run hook is present in the container image \
and gets executed at the end of the image build.  It will then build \
an rpm which contains the newly-produced image from kiwi/docker (using \
image.spec.in), and place the rpm in the correct location that it \
becomes an additional build artefact."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "containment-rpm-2.0.0-1.1.noarch.rpm"
RPM_HASH = "71130916e2aec3e806151628170bffa20f50a84049d94355692644b6c74a765f851b67c88adc73adbae0e6c4e20363e7350304af4fdbd7efb298ab092a19a916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "containment-rpm"

RDEPENDS:${PN} += "/bin/bash \
jq \
libxml2-tools"

inherit rpm
