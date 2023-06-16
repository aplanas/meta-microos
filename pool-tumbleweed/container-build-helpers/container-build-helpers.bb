SUMMARY = "Scripts to cleanup container images after a build"
DESCRIPTION = "This is a simple script that removes the unecessary bits and pieces left on a \
system after zypper has been run. This reduces the total size of the final \
container image."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1"

RPM_NAME = "container-build-helpers-0.0.1-1.5.noarch.rpm"
RPM_HASH = "235b882b9d77d40660631392677c9e6b409caadfb5c52c624f32e9fe5ecb50222e7d8e394ff0323033ace68a273624a20a3197538c4f24a18def4413de4ff0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-helpers"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
