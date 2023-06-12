SUMMARY = "Python lib for synching with OpenScienceFramework projects"
DESCRIPTION = "The pyosf package is a pure Python library for file sync with \
Open Science Framework. \
 \
This package is for synchronisation of files from the local \
file space to the Open Science Framework (OSF). There is a more \
complex sync package by the Center for Open Science, \
who created OSF, called osf-sync. \
 \
The OSF official package is designed for continuous automated \
synchronisation of many projects (à la Dropbox). The authors of pyosf \
needed something simpler (for combination with PsychoPy). The pyosf \
package performs basic search/login/sync operations with single \
projects on OSF, but only when instructed to do so (no continuous \
sync)."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-pyosf-1.0.5-5.8.noarch.rpm"
RPM_HASH = "a75e2fc83b3d1685d635552a5921a6a452c75a0496f40c8d0d2159eefeb8873aee9e1f9ec4e8fde27eaebf9f508cd3e4332e87ba0a20af69390000f056496d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyosf) \
python39-pyosf \
python3dist(pyosf)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
