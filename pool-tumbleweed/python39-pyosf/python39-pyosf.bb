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

RPM_NAME = "python39-pyosf-1.0.5-5.10.noarch.rpm"
RPM_HASH = "989295ab9a31238edc8905479137359dcb54f06f877dcf03164f3b632e7b1d1a50ab2d0de447ae0f84cd86628be7454f1cf8a008ed0bf164beeb6ea22c2847cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyosf \
python39-pyosf \
python3dist-pyosf"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
