SUMMARY = "Checkout GitLab merge requests / GitHub pull requests locally"
DESCRIPTION = "Checkout GitLab merge requests / GitHub pull requests locally."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "git-mr-1.0.0-2.9.noarch.rpm"
RPM_HASH = "ea5f1f2e3be235102f04731f11c843ed5a42a1e8d42e7f70175d1073e21948144a50021572aaf56af27623a57c9e8197ad1c6f9009696d939cb95a414bef66ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-mr \
git-pr"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
