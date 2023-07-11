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

RPM_NAME = "python310-pyosf-1.0.5-5.10.noarch.rpm"
RPM_HASH = "b7cf2d578cdf00e61e58eca9e182f73a6ecb051f68315f86074cbce40976e058b7b076f3973b42258a19f3391fe6c5ae27bf2176ad1573096dd4f756145fed6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyosf \
python310-pyosf \
python3dist-pyosf"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
